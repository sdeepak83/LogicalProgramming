package Logic2;

import java.util.Scanner;

public class SpyNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the number");
        int val = input.nextInt();
        int ogVal = val;
        int count = 0;
        int mul = 1;

        while (ogVal > 0) {
            int d = ogVal % 10;
            count += d;
            mul *= d;
            ogVal /= 10;

        }
        if (count == mul) {
            System.out.println("This is spy number number");
        } else {
            System.out.println("This is not spy number number");
        }

    }

}
