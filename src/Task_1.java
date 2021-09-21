import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи стоимость билета");
        int price = scan.nextInt();
        int step = 20;
        int mile = price / step;
        System.out.println(mile);
    }
}
