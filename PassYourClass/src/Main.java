import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("         Your Lesson Program:" + "\n" +
                "Turkish,English,Mathematics,Physics,Chemistry,Music,Painting" + "\n" +
                "------------------------------------------------------------");
        int turk, math, eng, phys, chem, music, paint;
        int t1 = 0;
        int t2 = 0;
        int t3 = 0;
        int t4 = 0;
        int t5 = 0;
        int t6 = 0;
        int t7 = 0;
        System.out.print("Enter the Turkish grade: ");
        turk = scan.nextInt();
        if (0 <= turk && turk <= 100) {
            t1 += turk;
        } else {
            t1 = 0;
        }
        System.out.print("Enter the Mathematics grade: ");
        math = scan.nextInt();
        if (0 <= math && math <= 100) {
            t2 += math;
        } else
            t2 = 0;
        System.out.print("Enter the English grade: ");
        eng = scan.nextInt();
        if (0 <= eng && eng <= 100) {
            t3 += eng;
        } else
            t3 = 0;
        System.out.print("Enter the Physics grade: ");
        phys = scan.nextInt();
        if (0 <= phys && phys <= 100) {
            t4 += phys;
        } else
            t4 = 0;

        System.out.print("Enter the Chemistry grade: ");
        chem = scan.nextInt();
        if (0 <= chem && chem <= 100) {
            t5 += chem;
        } else
            t5 = 0;
        System.out.print("Enter the Music grade: ");
        music = scan.nextInt();
        if (0 <= music && music <= 100) {
            t6 += music;
        } else
            t6 = 0;
        System.out.print("Enter the Painting grade: ");
        paint = scan.nextInt();
        if (0 <= paint && paint <= 100) {
            t7 += paint;
        } else
            t7 = 0;

        double average = (t1 + t2 + t3 + t4 + t5 + t6 + t7) / 7.0;
        if (average < 55) {
            System.out.println("you failed the class, see you next year :( ");
        } else
            System.out.println("Congratulations,you pass the class :))) ");

        System.out.println("Your average: " + average);


    }
}