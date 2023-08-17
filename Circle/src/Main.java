import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       System.out.print("Enter the circle's radius: ");
       int radius = scan.nextInt();

       final double Pİ = 3.14;

       double area,perimeter,result;
       area = Pİ * Math.pow(radius,2);
       perimeter = 2 * Pİ * radius;

       System.out.println("Area: " + area );
       System.out.println("Perimeter: " + perimeter );

       //The area of the slice of the circle for which we take the measure of the central angle "a"
       System.out.print("Enter the central angle: ");
       double a = scan.nextDouble();

       result = (Pİ * Math.pow(radius,2) * a) / 360;
       System.out.println("The area of the slice of the circle: " + result);

    }
}