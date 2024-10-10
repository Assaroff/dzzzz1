import java.util.Scanner;

public class zadacha7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("введите a: ");
        double a = sc.nextDouble();
        System.out.print("введите b: ");
        double b = sc1.nextDouble();
        System.out.print("введите c: ");
        double c = sc2.nextDouble();
        double D = b * b - 4 * a * c;
        if (D >= 0) {
            System.out.println("имеет вещественнные корня");
        } else {
            System.out.println("не имеет корней");
        }
    }

}
