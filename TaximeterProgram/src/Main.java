import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");

        System.out.print("Please enter the distance the customer wants to travel in kilometers: ");
        float distance = scan.nextFloat();
        System.out.println("Distance that customer wants to go: " + distance + " km");

        float perKmFee,openingFee,price,result;
        perKmFee = 2.20f;
        openingFee = 10.0f;

        price = openingFee + (distance * perKmFee);
        result = (price < 20) ? 20 : price ;
        System.out.println("Total price is: " + result + " TL");
    }
}