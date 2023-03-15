// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.

package Java_homework_4;

import java.util.LinkedList;
import java.util.Random;

public class task_2 {
    public static void main(String[] args)
    {
        LinkedList<Integer> queue = new LinkedList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++)
        {
            queue = enqueue(queue, random.nextInt(100));
        }
        System.out.println(queue.toString() + "\n");

        enqueue(queue, 1000000);
        System.out.println(queue.toString() + "\n");

        dequeue(queue);
        System.out.println(queue.toString() + "\n");

        first(queue);
        System.out.println(queue.toString());
    }

    static LinkedList enqueue(LinkedList list, int n)
    {
        list.add(n);
        return list;
    }

    static LinkedList dequeue(LinkedList list)
    {
        System.out.println(list.get(0));
        list.remove(0);
        return list;
    }

    static void first(LinkedList list)
    {
        System.out.println(list.get(0));
    }
}
