import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome :D ");
        String name, userName, password;
        System.out.println("Do you want to log in or sign up: " + "\n" + "If you want to sign up please enter:1" +
                "\n" + "If you want to login please enter:2");
        int selection = scan.nextInt();

        if (selection == 1) {
            System.out.println("Let's sign up PatikaDev ,Please enter your name: ");
            name = scan.next();
            scan.nextLine();
            System.out.print("Please create your username: ");
            userName = scan.nextLine();
            System.out.print("Please create your password: ");
            password = scan.nextLine();
            System.out.println("Name: " + name + "\n" + "username: " + userName + "\n" +
                    "password: " + password);
            System.out.println("You created a new account, welcome!");
        }
        if (selection == 2) {
            System.out.println("Please enter your username: ");
            userName = scan.next();
            System.out.println("Please enter your password: ");
            password = scan.next();
            if (userName.equals("zehraikbalozturk") && password.equals("Java2001")) {
                System.out.println("you have successfully logged in");
            } else {
                System.out.println("Do you want to reset your password: (yes / no)");
                String answer = scan.next();
                if (answer.equals("yes")) {
                    System.out.println("Please enter new password: ");
                    password = scan.next();
                    if (password.equals("Java2001"))
                        System.out.println("Please,try again because your new password same as old password!");
                    else
                        System.out.println("Your password is created :) ");
                }

            }
        }
    }
}