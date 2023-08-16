import java.util.Scanner;
public class KdvCalculator {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Welcome to KDV calculator program!!!");
       double vatAmount,amountOfMoney,amountOfVatMoney,vat1,vat2;

       System.out.println("Please enter your amount of money to be calculated: ");
       amountOfMoney = scan.nextDouble();
       vat1 = 0.18;
       vat2 = 0.08;

       vatAmount = (amountOfMoney <= 1000.0) ? amountOfMoney*vat1 : amountOfMoney*vat2;


       amountOfVatMoney = amountOfMoney + vatAmount;

        System.out.println("Money without VAT: " + amountOfMoney);
        System.out.println("Money with VAT: " + amountOfVatMoney);
        System.out.println("Value of VAT: " + vatAmount);

    }
}