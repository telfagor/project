package task1;

import java.util.Scanner;

public class Validator {

    public int getIntNumber() {
        Scanner console = new Scanner(System.in);
        int number;
        while (true) {
            if (console.hasNextInt()) {
                number = console.nextInt();
                if (number >= 0) {
                    break;
                } else {
                    System.out.println("The number must be greater than zero");
                    System.out.print("Enter an integer: ");
                }
            } else {
                System.out.println("Enter an integer please!");
                System.out.print("Enter an integer: ");
            }
            console.nextLine();
        }
        console.nextLine();
        return number;
    }
}
