public class exercise4 {
    public static void main(String[] args) {
        System.out.println("Таблица синусов от 0 до 90 градусов:");

        int valuesPerRow = 10;
        int count = 0;

        for (int degree = 0; degree <= 90; degree++) {
            double sineValue = Math.sin(Math.toRadians(degree));

            System.out.printf("%6.4f ", sineValue);
            count++;

            if (count == valuesPerRow) {
                System.out.println();
                count = 0;
            }
        }

        if (count != 0) {
            System.out.println();
        }
    }
}
