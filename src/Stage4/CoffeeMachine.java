package Stage4;

import java.util.Locale;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        ingredientsAmount();
        System.out.println();
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.start();
    }

    static final Scanner SCANNER = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int cups = 9;
    static int money = 550;

    void start() {
        State state = new ActionSelection();//IngredientsAmount()
        while (state != null) {
            state = state.showMenu();
        }
    }

    interface State {
        State showMenu();
    }

    public static void ingredientsAmount() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    class ActionSelection implements State {
        @Override
        public State showMenu() {
            System.out.println();
            System.out.println("Write action (buy, fill, take):");
            String choice = SCANNER.nextLine().toLowerCase(Locale.ROOT);
            return switch (choice) {
                case "buy" -> new Buy();
                case "fill" -> new Fill();
                case "take" -> new Take();
                default -> this;
            };
        }

    }

    class Buy implements State {
        @Override
        public State showMenu() {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
            switch (SCANNER.nextInt()) {
                case 1 -> prepare(Recipe.ESPRESSO);
                case 2 -> prepare(Recipe.LATTE);
                case 3 -> prepare(Recipe.CAPPUCCINO);
                default -> System.out.println("Invalid input");
            }
            System.out.println();
            ingredientsAmount();
            return null;//new IngredientsAmount();
        }

    }

    enum Recipe {
        ESPRESSO(250, 16, 1, 4),
        LATTE(350, 75, 20, 1, 7),
        CAPPUCCINO(200, 100, 12, 1, 6);
        final int water;
        int milk;
        final int coffeeBeans;
        final int cups;
        final int money;

        Recipe(int water, int coffeeBeans, int cups, int price) {
            this.water = water;
            this.coffeeBeans = coffeeBeans;
            this.cups = cups;
            this.money = price;
        }

        Recipe(int water, int milk, int coffeeBeans, int cups, int price) {
            this.water = water;
            this.milk = milk;
            this.coffeeBeans = coffeeBeans;
            this.cups = cups;
            this.money = price;
        }
    }

    void prepare(Recipe recipe) {
        if (water >= recipe.water) {
            water -= recipe.water;
            money += recipe.money;
        }
        if (milk >= recipe.milk) {
            milk -= recipe.milk;
        }
        if (coffeeBeans >= recipe.coffeeBeans) {
            coffeeBeans -= recipe.coffeeBeans;
        }
        if (cups >= recipe.cups) {
            cups -= recipe.cups;
        }
    }

    static class Fill implements State {
        @Override
        public State showMenu() {
            System.out.println("Write how many ml of water you want to add:");
            water += SCANNER.nextInt();
            System.out.println("Write how many ml of milk you want to add: ");
            milk += SCANNER.nextInt();
            System.out.println("Write how many grams of coffee beans you want to add: ");
            coffeeBeans += SCANNER.nextInt();
            System.out.println("Write how many disposable coffee cups you want to add: ");
            cups += SCANNER.nextInt();
            System.out.println();
            ingredientsAmount();
            return null;//new IngredientsAmount();
        }
    }

    static class Take implements State {
        @Override
        public State showMenu() {
            System.out.println("I gave you $" + money);
            money = 0;
            System.out.println();
            ingredientsAmount();
            return null;//new IngredientsAmount();
        }
    }
}
