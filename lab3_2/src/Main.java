import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        System.out.println("Enter d: ");
        double d = scanner.nextDouble();

        int points = 8;

        double stepX = (b - a) / (points - 1);
        double stepY = (d - c) / (points - 1);

        System.out.println("x\\y\t|\t" + generateHeader(a, b, points));
        System.out.println("-----------------------------------------------------------");

        for (double y = c; y <= d; y += stepY) {
            System.out.printf("%.2f\t|\t", y);
            for (double x = a; x <= b; x += stepX) {
                double u = Math.sin(x * y) + Math.cos(x / y);
                System.out.printf("%.2f\t", u);
            }
            System.out.println();
        }
    }

    public static String generateHeader(double start, double end, int points) {
        StringBuilder header = new StringBuilder();
        double step = (end - start) / (points - 1);

        for (double x = start; x <= end; x += step) {
            header.append(String.format("%.2f\t", x));
        }
        return header.toString();
    }
}

