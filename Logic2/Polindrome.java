package Logic2;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        int val = input.nextInt();
        int ogVal = val;
        int newVal = 0;

        while (val > 0) {
            int d = val % 10;
            newVal += d * 10;
            val /= 10;

        }
        if (ogVal == newVal)
            System.out.print("This is polindrome number : " + ogVal);
        System.out.println(ogVal);

    }
}
