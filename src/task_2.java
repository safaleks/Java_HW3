import com.sun.source.tree.IfTree;

import java.util.Arrays;

public class task_2 {
    public static void main(String[] args) {
        Integer Balance = 100;
        Integer Add = 900;
        Integer Bonus;
        if (Add >= 1000){
             Bonus = Add/100;
        }
        else{
             Bonus = 0;
        }
        Integer Total = Add+Balance+Bonus;
        System.out.println("Итоговый счёт = " + Total + " рублей");
        System.out.println("Бонусом = " + Bonus + " рублей");

    }
}
