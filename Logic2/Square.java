package Logic2;

import java.util.Scanner;

public class Square {

    public static void main(String[] arg) {
        int base = 2;
        int power = 5;
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println(result);

    }

}
