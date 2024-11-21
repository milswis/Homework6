import java.util.Random;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Сгенерированный массив: ");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Введите значение для замены: ");
        int valueToFind = scanner.nextInt();
        System.out.print("Введите новое значение: ");
        int newValue = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == valueToFind) {
                array[i] = newValue;
                found = true;
            }
        }

        if (found) {
            System.out.println("Массив после замены: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Значение не найдено.");
        }
    }
}