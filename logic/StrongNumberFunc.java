package logic;

public class StrongNumberFunc {
    public static void main(String[] args) {
        int val = 149;
        boolean result = isStrong(val);
        if (result)
            System.out.println("This is strong num");
        else
            System.out.println("It is not strong number");

    }

    public static boolean isStrong(int num) {

        int orignalVal = num;
        int sum = 0;

        while (num > 0) {
            int d = num % 10;
            int fact = 1;
            for (int i = d; i >= 1; i--) {
                fact = fact * i;
            }
            sum = sum + fact;
            num /= 10;

        }

        return orignalVal == sum;

    }

}
