import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1, number2;
        System.out.print("Enter the first number: ");
        number1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        number2 = scan.nextInt();

        //System.out.println("Number1:" +number1 + " - " + " Number2:" +number2);

        System.out.println("Operations available on the calculator" + "\n" + "--------------------------");
        System.out.println("Addition: 1" + "\n" + "Subtraction: 2" +
                "\n" + "Multiplication: 3" + "\n" + "Division: 4");

        System.out.println("Please enter your selection: ");
        int selection = scan.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Summation: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Subtraction: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Multiplication: " + (number1 * number2));
                break;
            case 4:
                if (number2 != 0)
                    System.out.println("Division: " + (number1 / number2));
                else
                    System.out.println("Please,try again because we cannot divide any number into zero!");
                break;
            default:
                System.out.println("You entered incorrectly");

        }


    }
}