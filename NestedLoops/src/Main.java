import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the digit number: ");
        int digit = scan.nextInt();

        for(int i = 1 ; i<=digit ; i++){
            for(int j = 1 ; j<=(digit-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=((2*i)-1); k++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}