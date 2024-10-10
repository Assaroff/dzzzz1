package Zadacha1;

public class zadacha3 {
    public static void main(String[] args) {
//Дано трехзначное число. Найти число, полученное при прочтении его цифр
        //справа налево
        int g = 523;
        String g1 = "5";
        String g2 = "2";
        String g3 = "3";
        String g4 = g3 + g2 + g1;
        System.out.println(g4);

        int num7=203;
        int j1, j2, j3;
        j1=num7%10;
        num7/=10;
        j2=num7%10;
        num7/=10;
        j3=num7%10;
        System.out.print(j1);
        System.out.print(j2);
        System.out.println(j3);
    }
}
