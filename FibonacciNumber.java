public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int num = 1; num <= n; num++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println("the fibonnacy number is " + sum);
        }

    }

}
