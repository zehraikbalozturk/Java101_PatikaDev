import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int total = 0, num;
        num = scan.nextInt();
        while (num % 2 == 0) {
            if (num % 4 == 0) {
                total += num;
            } else
                total = 0;
            System.out.print("enter number: ");
            num = scan.nextInt();

        }
        System.out.println("Total is: " + total);
    }
}