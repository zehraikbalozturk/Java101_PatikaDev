import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       System.out.println("Welcome to Grade Calculator :))");

       System.out.println("Please enter your name and surname: ");
       String name = scan.nextLine();
       System.out.println("Enter the Math grade: ");
       int math = scan.nextInt();
       System.out.println("Enter the Physics grade: ");
       int physics = scan.nextInt();
       System.out.println("Enter the Chemistry  grade: ");
       int chem = scan.nextInt();
       System.out.println("Enter the Turkish grade: ");
       int turkish = scan.nextInt();
       System.out.println("Enter the History grade: ");
       int his = scan.nextInt();
       System.out.println("Enter the Music grade: ");
       int music = scan.nextInt();

       int total = (math + physics + chem + turkish + his + music);
       double average = total / 6;

       System.out.println("Your average is: " + average);

       double passingLimit = 60.0;
       String sonuc;
       sonuc = (average>=60) ? "Pass your class,congratulations :))": "sorry, you failed the class";

       System.out.println(sonuc);
    }
}