package Logic2;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the  number");
        int num = input.nextInt();
        int mul = num * num;
        int count = 0;

        while (mul > 0) {
            int d = mul % 10;
            count += d;
            mul /= 10;
        }

        if (num == count) {
            System.out.println("This is a Neon number");
        } else {
            System.out.println("This is not a neon number");
        }
    }
}
