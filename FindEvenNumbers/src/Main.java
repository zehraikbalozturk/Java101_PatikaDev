import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i =1,k;
        System.out.println("Enter the number of k: ");
        k=scan.nextInt();
        while(i<=k){
            if(i % 2 == 0)
                System.out.print(i + ",");
        i++;
        }

    }
}