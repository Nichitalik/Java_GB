// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package Java_homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));
        }

        System.out.println(list.toString());

        System.out.println("min: " + Collections.min(list));
        System.out.println("max: " + Collections.max(list));
        System.out.println("avg: " + avg(list));

    }

    static int avg(ArrayList<Integer> list)
    {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }

}
