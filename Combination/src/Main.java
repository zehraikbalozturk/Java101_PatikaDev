import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of cluster: ");
        int comb;
        int cluster = scan.nextInt();
        int total = 1;
        for(int i = 1; i<=cluster ; i++){
            total = total * i;
        }
        System.out.println("n!: " + total);

        System.out.print("Please enter the number of r: ");
        int r = scan.nextInt();
        int sum = 1;
        for(int j = 1; j<= (cluster-r) ; j++){
            sum = sum * j;
        }
        System.out.println("(n-r)!: " + sum);

        int add = 1;
        for(int k = 1 ; k <= r ; k++){
            add = add * k;
        }
        System.out.println("r!: " + add);

        comb = total / (add * sum);
        System.out.println("n! / (r! * (n-r))!: " + comb);


    }
}