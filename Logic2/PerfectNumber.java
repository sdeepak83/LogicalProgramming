package Logic2;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int val = input.nextInt();
        int num = 1;
        for (int i = 1; i <= val / 2; i++) {
            if (val % i == 0) {
                num *= i;
            }
        }
        if (num == val) {
            System.out.println("This is Perfect number");
        } else {
            System.out.println("This is not Perfect number");
        }
    }

}
