import java.util.Scanner;

//Работа светофора для пешеходов запрограммирована следующим образом: в
//начале каждого часа в течение трех минут горит зеленый сигнал, затем в течение двух минут — красный, в течение трех минут — опять зеленый и т. д.
//Дано вещественное число t, означающее время в минутах, прошедшее с начала очередного часа. Определить, сигнал какого цвета горит для пешеходов в
//этот момент.

public class zadacha8 {
    public static void main(String[] args) {
        System.out.print("введите кол-во минут прошедших сначала часа (вещественное число пишите через запятую): ");
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        double p = t % 5;
        if ( p < 3 ) {
            System.out.println("горит зелёный");
        } else {
            System.out.println("горит красный");
        }







    }
}