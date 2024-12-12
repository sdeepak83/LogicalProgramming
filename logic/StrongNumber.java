package logic;

public class StrongNumber {
    public static void main(String[] args) {
        int num = 1;
        int orignalVal = num;
        int sum = 0;

        while (num > 0) {
            int fact = 1;
            int d = num % 10;
            for (int i = d; i >= 1; i--) {
                fact = fact * i;

            }
            sum = sum + fact;
            num /= 10;
        }

        if (orignalVal == sum) {
            System.out.println("This is Strong number");
        } else {
            System.out.println("This is not Strong number");
        }
    }

}
