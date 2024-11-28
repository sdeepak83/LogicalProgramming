//              *    SPY NUMBER

// *  int val = 1124

// *  Sum =  1+1+2+4=8
// *  Product = 1*1*2*4=8

// *  If sum == Product so number is Spy Number

public class SpyNumber {
    public static void main(String[] args) {
        int num = 123;
        boolean result = isSpy(num);

        if (result)
            System.out.println("this is neon number");
        else
            System.out.println("This is not neon number");

    }

    public static boolean isSpy(int num) {
        int sum = 0;
        int mul = 1;
        boolean flag = false;

        while (num > 0) {
            int d = num % 10;
            sum += d;
            mul *= d;
            num /= 10;
        }
        if (sum == mul) {
            flag = true;
        }
        return flag;

    }

}
