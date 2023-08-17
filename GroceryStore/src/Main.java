import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Grocery Patika!" + "\n" + "We always have fresh and delicious fruits and vegetables :D");
        System.out.println("-------------------------------------------------");
        System.out.println("Below is the price per kilogram of the fruits and vegetables you requested.");
        System.out.println("pear = 2.14;\n" + "apple = 3.67;\n" + "tomatoes = 1.11;\n" + "banana = 0.95;\n" + "eggplant = 5.00;");
        double pear, apple ,tomatoes ,banana ,eggplant,totalPrice;

        pear = 2.14;
        apple = 3.67;
        tomatoes = 1.11;
        banana = 0.95;
        eggplant = 5.00;

        System.out.println("How much pear do u want? ");
        double kgPear = scan.nextDouble();
        System.out.println("How much apple do u want? ");
        double kgApple = scan.nextDouble();
        System.out.println("How much tomatoes do u want? ");
        double kgTomat = scan.nextDouble();
        System.out.println("How much banana do u want? ");
        double kgBanana = scan.nextDouble();
        System.out.println("How much eggplant do u want? ");
        double kgEggPl = scan.nextDouble();

        totalPrice = (pear*kgPear)+ (apple*kgApple) + (tomatoes*kgTomat) + (banana*kgBanana) + (eggplant*kgEggPl);
        System.out.println("Kilogram of Pear: " + kgPear + "\n" +
                "Kilogram of Appple: " + kgApple + "\n" + "Kilogram of Tomatoes: " + kgTomat + "\n" + "Kilogram of Banan: " + kgBanana + "\n" +
                "Kilogram of EggPlant: " + kgEggPl + "\n" + "Total Price is: " + "\n" + totalPrice);







    }
}