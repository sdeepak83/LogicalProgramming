public class Polindrome {
    public static void main(String[] args) {
        int num = 121;
        int origenal = num;
        int rev = 0;

        while (num > 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num = num / 10;
        }
        if (origenal == rev)
            System.out.println("this is a pelindrome number");
    }
}
