package Zadacha1;

import java.util.Scanner;

public class zadacha6 {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите четырёхзначное число: ");
        int number = scanner.nextInt();

        int sum = 0;

        int mult = 1;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            mult = mult*digit;
            number = number / 10;

        }

        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + mult);

    }
}