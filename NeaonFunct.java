//              *    NEAON NUMBER

// *  num=9
// *  val = 9*9 =81
// *  digit 81 = 8+1=9
// *  so num = square of num and addition of digit = num;

public class NeaonFunct {
    public static void main(String[] args) {
        int num = 27;
        boolean val = isNeaon(num);
        if (val)
            System.out.println("This is neo number");
        else
            System.out.println("This is not a neon number");

    }

    public static boolean isNeaon(int num) {
        int mul = num * num;
        int sum = 0;
        boolean flag = false;

        while (mul > 0) {
            int d = mul % 10;
            sum += d;
            mul /= 10;
        }
        if (sum == num) {
            flag = true;
        }
        return flag;
    }

}
