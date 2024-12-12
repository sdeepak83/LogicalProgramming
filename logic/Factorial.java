package logic;

public class Factorial {
    public static void main(String[] args) {
        int num = 3;
        int fact = 1;
        for (int i = 1; i <= 19; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }
}
