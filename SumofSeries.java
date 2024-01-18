import java.util.Scanner;
public class SumofSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the value of n(numbers): ");
        int n = scanner.nextInt();
        double sum = calculateSeriesSum(x, n);
        System.out.println("Sum of the series is: " + sum);
        scanner.close();
    }
    static double calculateSeriesSum(double x, int n) {
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(x, i);
        }
        return sum;
    }
}