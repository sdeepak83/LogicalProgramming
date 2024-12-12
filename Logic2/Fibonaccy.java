package Logic2;

import java.util.Scanner;

public class Fibonaccy {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter the number");
        int val = input.nextInt();
        int ogVal = val;
        int mul = 1;

        for (int i = 1; i <= ogVal; i++) {
            mul *= i;
        }
        System.out.println(mul);
    }
}