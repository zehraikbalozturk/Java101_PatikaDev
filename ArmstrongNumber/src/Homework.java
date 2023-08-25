import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int digitNumber = 0;
        int digitValue;
        int result = 0;
        int tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            digitNumber++;
        }
        
        tempNumber = number;

        for (int i = 1; i <= digitNumber; i++) {

            digitValue = tempNumber % 10;
            result += digitValue;
            tempNumber /= 10;

        }
        System.out.println("Sum of digits: " + result);
    }

}
