public class Main {
    public static void main(String[] args) {
        for (int num = 100; num <= 999; num++) {
            int digitNum = 0;
            int digitValue;
            int result = 0;
            int digitPow;
            int tempNum = num;
            while (tempNum != 0) {
                tempNum /= 10;
                digitNum++;
            }
            tempNum = num;
            while (tempNum != 0) {
                digitValue = tempNum % 10;
                digitPow = 1;
                for (int i = 1; i <= digitNum; i++) {
                    digitPow *= digitValue;
                }
                result += digitPow;
                tempNum /= 10;
            }
            if (result == num)
                System.out.println("The number of " + num + " is an armstrong number.");


        }
    }
}