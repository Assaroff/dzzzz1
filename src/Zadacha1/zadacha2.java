package Zadacha1;

import java.util.Scanner;

public class zadacha2 {
    public static void main(String[] args) {
//С начала суток прошло n секунд. Определить:
        //а) сколько полных часов прошло с начала суток;
        //б) сколько полных минут прошло с начала очередного часа;
        //в) сколько полных секунд прошло с начала очередной минуты.
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество секунд, прошедших с начала суток ");
        int n = scan.nextInt();


        int hour = n / 3600; //3600 sec=1 hour
        System.out.println("Кол-во прошедших полных часов с начала суток " +hour);

        int min = (n%3600) / 60;
        System.out.println("Кол-во прошедших полных минут с начала очередного часа " +min);

        int sec = n %60;
        System.out.println("Кол-во прошедших полных секунд с начала очередной минуты " +sec);


    }

}
