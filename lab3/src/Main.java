import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();

        double sum = 0;
        double term = 1;
        int k = 0;

        while (Math.abs(term) >= 0.00001) {
            sum += term;
            k++;
            term = Math.pow(x, k) / factorial(k);
        }

        //Значення експоненційної функції за рядом
        System.out.println("The value of the exponential function by series: " + sum);
        //Кількість доданків
        System.out.println("Number of terms: " + k);

        double expValue = Math.exp(x);
        System.out.println("Value of the exponential function using the library: " + expValue);
    }

    public static double factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
