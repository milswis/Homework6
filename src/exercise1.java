import java.util.Random;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Сгенерированный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nКоличество четных чисел: " + evenCount);
        System.out.println("Количество нечетных чисел: " + oddCount);
    }
}