import com.sun.source.tree.IfTree;

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        int balance = 100;
        int add = 900;
        int bonus;
        if (add >= 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }
        int Total = add + balance + bonus;
        System.out.println("Итоговый счёт = " + Total + " рублей");
        System.out.println("Бонусом = " + bonus + " рублей");
    }
}
