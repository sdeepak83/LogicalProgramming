package Logic2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter the Number");
        int val = input.nextInt();
        int count = 0;
        for (int i = 1; i <= val; i++) {
            if (val % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("This is a prime Number");
        } else {
            System.out.println("This is not a prime Number");
        }
    }
}
