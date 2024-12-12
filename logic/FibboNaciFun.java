package logic;

public class FibboNaciFun {
    public static void main(String[] args) {
        int num = 5;
        int mainResult = fibonnaci(num);
        if (mainResult == -1) {
            System.out.println("Please enter valid number");
        }
        System.out.println(mainResult);
    }

    public static int fibonnaci(int num) {

        if (num < 1) {
            return -1;
        }

        int a = 0;
        int b = 1;

        for (int i = 1; i <= num; i++) {

            int result = a + b;
            a = b;
            b = result;

            System.out.println("fibbonaci num is" + result);
        }

        return 1;
    }
}