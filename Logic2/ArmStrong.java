package Logic2;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        int val = input.nextInt();
        int num = val;
        int countDigit = 0;
        int addDigit = 0;

        while (num != 0) {
            countDigit++;
            num /= 10;
        }

        num = val;
        while (num != 0) {
            int d = num % 10;
            int mul = 1;

            for (int i = 1; i <= countDigit; i++) {
                mul *= d;
            }
            addDigit += mul;
            num /= 10;
        }

        if (val == addDigit) {
            System.out.println("the number is ArmStrong");

        } else {
            System.out.println("the number is not ArmStrong");
        }

    }

}
