
public class PerfectNumber {
    public static void main(String[] args) {

        for (int j = 0; j <= 100; j++) {
            int num = j;
            int count = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    count += i;
                }
            }
            if (num == count)
                System.out.println("This is a perfect number " + num);
            // else
            // System.out.println("This is not a perfect number");
        }
    }
}
