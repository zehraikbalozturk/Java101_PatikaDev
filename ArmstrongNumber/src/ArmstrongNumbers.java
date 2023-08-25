public class ArmstrongNumbers {
    public static void main(String[] args) {
        for (int num = 100; num <= 999; num++) {
            int originalNumber = num;
            int sum = 0;

            int digit1 = num % 10;
            int digit2 = (num / 10) % 10;
            int digit3 = num / 100;

            int cube1 = digit1 * digit1 * digit1;
            int cube2 = digit2 * digit2 * digit2;
            int cube3 = digit3 * digit3 * digit3;

            sum = cube1 + cube2 + cube3;

            if (sum == originalNumber) {
                System.out.println(num);
            }
        }
    }
}

