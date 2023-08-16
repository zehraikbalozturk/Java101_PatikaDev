import java.util.Scanner;
public class HypotenuseOfTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the program that finds the hypotenuse of a right triangle!");

        double edge1,edge2,hypotenuse;

        System.out.print("Enter the triangle's first edge: ");
        edge1 = scan.nextDouble();
        System.out.print("Enter the triangle's second edge: ");
        edge2 = scan.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(edge1,2) + Math.pow(edge2,2));
        System.out.println(hypotenuse);

    }
}