import java.util.Scanner;

public class zadacha10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int first = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int second = scanner.nextInt();

        System.out.print("Введите третье целое число: ");
        int third = scanner.nextInt();

        // Инициализация переменных для хранения наибольшего, наименьшего и среднего значений
        int max, min, mid;

        // Определение наибольшего числа
        max = Math.max(first, Math.max(second, third));

        // Определение наименьшего числа
        min = Math.min(first, Math.min(second, third));

        // Определение среднего числа
        if ((first > min && first < max)) {
            mid = first;
        } else if (second > min && second < max) {
            mid = second;
        } else {
            mid = third;
        }

        // Вывод результатов
        System.out.println("Самое большое число: " + max);
        System.out.println("Самое маленькое число: " + min);
        System.out.println("Среднее число: " + mid);

        scanner.close();
    }
}