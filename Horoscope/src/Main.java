import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's find your horoscope ;)");
        System.out.println("1:January" + "\n" + "2:February" + "\n" + "3:March" + "\n" +
                "4:April" + "\n" + "5:May" + "\n" + "6:June" + "\n" +
                "7:July" + "\n" + "8:August" + "\n" + "9:September" + "\n" + "10:October" + "\n" +
                "11:November" + "\n" + "12:December");
        String nameSurname;
        int bMonth, bDay;
        String horoscope = "null";
        boolean isError = false;

        System.out.print("Please,Enter the name and surname: ");
        nameSurname = scan.nextLine();

        System.out.println("Please,Enter the day of month");
        bMonth = scan.nextInt();

        System.out.println("Please,Enter the day of birth");
        bDay = scan.nextInt();
        if (bMonth == 1) {
            if (bDay >= 1 && bDay <= 31) {
                if (bDay < 22) {
                    horoscope = "capricorn";
                } else
                    horoscope = "aquarius";
            } else
                isError = true;
        }
        if (bMonth == 2) {
            if (bDay >= 1 && bDay <= 28) {
                if (bDay < 20) {
                    horoscope = "aquarius";
                } else
                    horoscope = "fish";
            } else
                isError = true;
        }
        if (bMonth == 3) {
            if (bDay >= 1 && bDay <= 31) {
                if (bDay < 21) {
                    horoscope = "fish";
                } else
                    horoscope = "aries";
            } else
                isError = true;
        }
        if (bMonth == 4) {
            if (bDay >= 1 && bDay <= 30) {
                if (bDay < 21) {
                    horoscope = "aries";
                } else
                    horoscope = "taurus";
            } else
                isError = true;
        }
        if (bMonth == 5) {
            if (bDay >= 1 && bDay <= 31) {
                if (bDay < 22) {
                    horoscope = "taurus";
                } else
                    horoscope = "gemini";
            } else
                isError = true;
        }
        if (bMonth == 6) {
            if (bDay >= 1 && bDay <= 30) {
                if (bDay < 23) {
                    horoscope = "gemini";
                } else
                    horoscope = "cancer";
            } else
                isError = true;
        }
        if (bMonth == 7) {
            if (bDay >= 1 && bDay <= 31) {
                if (bDay < 23) {
                    horoscope = "cancer";
                } else
                    horoscope = "leo";
            } else
                isError = true;
        }
        if (bMonth == 8) {
            if (bDay >= 1 && bDay <= 31) {
                if (bDay < 23) {
                    horoscope = "leo";
                } else
                    horoscope = "virgo";
            } else
                isError = true;
        }
        if (bMonth == 9) {
            if (bDay >= 1 && bDay <= 30) {
                if (bDay < 23) {
                    horoscope = "virgo";
                } else
                    horoscope = "libra";
            } else
                isError = true;
        }
        if (bMonth == 10) {
            if (bDay >= 1 && bDay <= 31) {
                if (bDay < 23) {
                    horoscope = "libre";
                } else
                    horoscope = "scorpio";
            } else
                isError = true;
        }
        if (bMonth == 11) {
            if (bDay >= 1 && bDay <= 30) {
                if (bDay < 22) {
                    horoscope = "scorpio";
                } else
                    horoscope = "sagittarius";
            } else
                isError = true;
        }
        if (bMonth == 12) {
            if (bDay >= 1 && bDay <= 30) {
                if (bDay < 22) {
                    horoscope = "sagittarius";
                } else
                    horoscope = "capricorn";
            } else
                isError = true;
        }
        if (bMonth > 12 && bMonth < 1)
            isError = true;

        if (isError)
            System.out.println("Your entered is not correct.");

        else
            System.out.println("Your horoscope is:" + horoscope);

    }
}