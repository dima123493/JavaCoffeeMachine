package Stage3;

import java.util.Scanner;

public class CoffeeMachine {
    static int water = 0;
    static int milk = 0;
    static int coffeeBeans = 0;
    static int cups = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        coffeeBeans += scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        cups += scanner.nextInt();

        int coffeeCount = 0;

        while (water >= 200 && milk >= 50 && coffeeBeans >= 15) {
            coffeeCount += 1;
            water -= 200;
            milk -= 50;
            coffeeBeans -= 15;
        }

        if (cups == coffeeCount) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (coffeeCount > cups) {
            coffeeCount = coffeeCount - cups;
            System.out.println("Yes, I can make that amount of coffee (and even " + coffeeCount + " more than that)");
        } else {
            System.out.println("No, I can make only " + coffeeCount + " cup(s) of coffee");
        }
    }
}
