import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       //4^5 = 4 * 4 * 4 * 4 * 4
        int n,k;
        System.out.print("Enter the number to get the exponent: ");
        n = scan.nextInt();
        System.out.print("Enter the number to be the exponent: ");
        k = scan.nextInt();
        int total = 1;
        for(int i = 1 ; i<=k ; i++){
            total = total * n;
        }
        System.out.println("Answer: " + total);
    }
}