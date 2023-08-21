import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int age, route;
        double totalFee, km, totalPrice = 0;
        double perKmFee = 0.10;
        boolean isError = false;

        System.out.println("Welcome to Ticket Sales Site" + "\n" + "Please,Enter your name and surname:");
        name = scan.nextLine();

        System.out.print("Please enter your age: ");
        age = scan.nextInt();
        if (age < 0)
            isError = true;

        System.out.println("Please choose trip type" + "\n" +
                "1:One Way" + "\n" + "2:Round Trip");
        route = scan.nextInt();
        if (route != 1 && route != 2)
            isError = true;

        System.out.println("Can you write your distance in kilometers?");
        km = scan.nextInt();
        if (km < 0) {
            isError = true;
        }

        totalFee = (km * perKmFee);


        if (age > 0 && age < 12) {
            totalPrice = (totalFee -= (totalFee / 2));
        } else if (age >= 12 && age <= 24) {
            totalPrice = (totalFee -= (totalFee / 10));
        } else if (age >= 65) {
            totalPrice = (totalFee -= ((3 * totalFee) / 10));
        } else
            totalPrice = totalFee;

        if (route == 2)
            totalPrice = 2 * (totalFee -= (totalFee / 5));
        else
            totalPrice = totalFee;


        if (isError)
            System.out.println("You entered incorrectly!");
        else
            System.out.println("Name: " + name + "\n" + "Age: " + age +
                    "\n" + "Total Price: " + totalPrice + "tl");
    }

}