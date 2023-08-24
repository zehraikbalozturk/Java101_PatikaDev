import java.util.Scanner;

public class FindEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0, k, count = 0;
        System.out.print("k: ");
        k = scan.nextInt();
        for (int i = 1; i <= k; i++) {
            if (i % 12 == 0) {
                System.out.println(i + " ");
                total += i;
                count++;
            }
        }
        if (count == 0)
            System.out.println("Average is not calculated.");
        else {
            double average;
            System.out.println("Total is: " + total);
            average = (double) total / count;
            System.out.println("Average is: " + average);
        }
    }
}
