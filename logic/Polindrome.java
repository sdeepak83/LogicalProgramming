package logic;
//  ** polindrome number 

// **  num =121;
// **  and 121 opposite digit is also 121 thats why it is polindrome number
// **  if num == num2 means it is polindrome

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
