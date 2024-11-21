import java.util.Random;
import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Сгенерированный массив: ");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Проверьте массив на (1 - возрастание, 2 - убывание): ");
        int choice = scanner.nextInt();

        boolean isOrdered = true;

        if (choice == 1) {
            for (int i = 0; i < size - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isOrdered = false;
                    break;
                }
            }
            System.out.println(isOrdered ? "Массив упорядочен по возрастанию." : "Массив НЕ упорядочен по возрастанию.");
        } else if (choice == 2) {
            for (int i = 0; i < size - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isOrdered = false;
                    break;
                }
            }
            System.out.println(isOrdered ? "Массив упорядочен по убыванию." : "Массив НЕ упорядочен по убыванию.");
        } else {
            System.out.println("Неверный выбор. Пожалуйста, введите 1 или 2.");
        }
    }
}