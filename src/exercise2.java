import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество углов (n): ");
        int n = scanner.nextInt();

        if (n < 3) {
            System.out.println("Многоугольник не может существовать, так как n < 3.");
            return;
        }

        int[] angles = new int[n];
        int sumOfAngles = 0;

        System.out.println("Введите углы многоугольника: ");
        for (int i = 0; i < n; i++) {
            angles[i] = scanner.nextInt();
            sumOfAngles += angles[i];
        }

        int theoreticalSum = 180 * (n - 2);

        if (sumOfAngles == theoreticalSum) {
            System.out.println("Многоугольник с такими углами может существовать.");
        } else {
            System.out.println("Многоугольник с такими углами НЕ может существовать.");
        }
    }
}