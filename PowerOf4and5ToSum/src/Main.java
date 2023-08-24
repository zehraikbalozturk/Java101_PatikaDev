import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scan.nextInt();
        System.out.println("The power of 4: ");
        for (int i = 1; i <= num; i *= 4)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("The power of 5: ");
        for (int j = 1; j <= num; j *= 5)
            System.out.print(j + " ");


    }
}