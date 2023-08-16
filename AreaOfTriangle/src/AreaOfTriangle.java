import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the program that calculates area of triangle!");

        double a,b,c,area,perimeter;

        System.out.print("Enter the first edge: ");
        a = scan.nextDouble();
        System.out.print("Enter the second edge: ");
        b = scan.nextDouble();
        System.out.print("Enter the third edge: ");
        c = scan.nextDouble();

        double u = (a+b+c) / 2 ;
        perimeter = 2*u;
        area = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Triangle's Perimeter: " + perimeter);
        System.out.println("Triangle's Area: " + area);


    }
}
