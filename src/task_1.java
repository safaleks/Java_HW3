import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи стоимость билета");
        Integer Price = scan.nextInt();
        Integer step = 20;
        Integer Mile = Price / step;
        System.out.println(Mile);


        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}
