import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Let's calculate your body mass index :)");

        System.out.println("Please enter your name and surname: ");
        String nameSurname = scan.nextLine();
        System.out.println("Please enter your age:");
        int age = scan.nextInt();

        System.out.println("Enter your height in meter: ");
        double height = scan.nextDouble();

        System.out.println("Enter your weight: ");
        double weight = scan.nextDouble();

        double bMIndex = weight / (height * height);
        System.out.println("Name/Surname: " + nameSurname + "\n" + "Age: " + age + "\n" + "Height: " + height +
                "\n" + "Weight: " + weight + "\n" + "Your BMI: " + bMIndex);

    }
}