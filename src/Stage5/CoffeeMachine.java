package Stage5;

import java.util.Locale;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
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
        State state = new ActionSelection();
        while (state != null) {
            state = state.showMenu();
        }
    }

    interface State {
        State showMenu();
    }

    class IngredientsAmount implements State {
        @Override
        public State showMenu() {
            System.out.println("The coffee machine has:");
            System.out.println(water + " ml of water");
            System.out.println(milk + " ml of milk");
            System.out.println(coffeeBeans + " g of coffee beans");
            System.out.println(cups + " disposable cups");
            System.out.println("$" + money + " of money");
            System.out.println();
            return new ActionSelection();
        }
    }

    class ActionSelection implements State {
        @Override
        public State showMenu() {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine().toLowerCase(Locale.ROOT);
            switch (choice) {
                case "buy":
                    System.out.println();
                    return new Buy();
                case "fill":
                    System.out.println();
                    return new Fill();
                case "take":
                    System.out.println();
                    return new Take();
                case "remaining":
                    System.out.println();
                    return new IngredientsAmount();
                case "exit":
                    return null;
            }
            return this;
        }

    }

    class Buy implements State {
        @Override
        public State showMenu() {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine().toLowerCase(Locale.ROOT);
            switch (choice) {
                case "1":
                    prepare(Recipe.ESPRESSO);
                    break;
                case "2":
                    prepare(Recipe.LATTE);
                    break;
                case "3":
                    prepare(Recipe.CAPPUCCINO);
                    break;
                case "back":
                    return new ActionSelection();
                default:
                    System.out.println("Invalid input");
            }
            System.out.println();
            return new ActionSelection();
        }

    }

    class Fill implements State {
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
            return new ActionSelection();
        }
    }

    enum Recipe {
        ESPRESSO(250, 16, 1, 4),
        LATTE(350, 75, 20, 1, 7),
        CAPPUCCINO(200, 100, 12, 1, 6);
        final int water;
        final int milk;
        final int coffeeBeans;
        final int cups;
        final int money;

        Recipe(int water, int coffeeBeans, int cups, int price) {
            this.water = water;
            this.coffeeBeans = coffeeBeans;
            this.cups = cups;
            this.money = price;
            milk = 0;
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
        if (water >= recipe.water && milk >= recipe.milk && coffeeBeans >= recipe.coffeeBeans && cups >= recipe.cups) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= recipe.water;
            milk -= recipe.milk;
            coffeeBeans -= recipe.coffeeBeans;
            cups -= recipe.cups;
            money += recipe.money;
        } else {
            if (water <= recipe.water) {
                System.out.println("Sorry, not enough water!");
            }
            if (milk <= recipe.milk) {
                System.out.println("Sorry, not enough milk!");
            }
            if (coffeeBeans <= recipe.coffeeBeans) {
                System.out.println("Sorry, not enough coffee beans!");
            }
            if (cups <= recipe.cups) {
                System.out.println("Sorry, not enough cups!");
            }
        }
    }

    class Take implements State {
        @Override
        public State showMenu() {
            System.out.println("I gave you $" + money);
            money = 0;
            System.out.println();

            return new ActionSelection();
        }
    }
}
