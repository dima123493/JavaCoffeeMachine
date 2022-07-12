package Stage2;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Write how many cups of coffee you will need:");
        Scanner scanner = new Scanner(System.in);
        int amountOfCups = scanner.nextInt();
        int water = 200 * amountOfCups;
        int milk = 50 * amountOfCups;
        int coffeeBeans = 15 * amountOfCups;
        System.out.println("For" + amountOfCups + " cups of coffee you will need:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
    }
}
