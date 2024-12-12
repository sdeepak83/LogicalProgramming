package Logic2;

import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter the number");
        int val = input.nextInt();
        int ogVal = val;
        int add = 0;

        while (val > 0) {
            int d = val % 10;
            int mul = 1;
            for (int i = 1; i <= d; i++) {
                mul *= i;
            }
            add += mul;
            val /= 10;

        }
        if (ogVal == add) {
            System.out.println("This is a Strong number");

        } else {
            System.out.println("This is not a Strong number");
        }
    }
}
