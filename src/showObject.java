import java.util.Scanner;

public class showObject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while(choice!= 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the bot-left square triangle");
            System.out.println("3. Draw the top-left square triangle");
            System.out.println("4. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Draw the bot-left square triangle");
                    for (int i = 1; i <=5 ; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Draw the top-left square triangle");
                    for (int i = 6; i >=1 ; i--) {
                        for (int j = 1; j < i ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Draw the isosceles triangle");
                    for (int i = 1; i <6; i++) {
                        for (int j = 1; j < 7-i ; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2*i -1 ; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
