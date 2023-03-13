// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл


package Java_homework_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class task_2 {
    public static void main(String[] args) throws IOException{
        int [] a = {1,5,76,-34,673,-3};
        bubbleSort(a);
        System.out.print("Sort array: ");
        System.out.println(arr_to_String(a));
    }

    static String arr_to_String(int[] n)
    {
        StringBuilder resultString = new StringBuilder();
        for (int i : n) {
            resultString.append(i + " ");
        }

        return resultString.toString();
    }


    static int[] bubbleSort(int[] n) throws IOException
    {
        Path path = Path.of("Java_homework/Java_homework_2/log_Task_2.txt");
        StringBuilder toFile = new StringBuilder();

        for (int i = 0; i < n.length - 1; i++) {
            for(int j = 0; j < n.length - i - 1; j++) {
                if(n[j + 1] < n[j]) {
                    int swap = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = swap;
                }
                toFile.append(arr_to_String(n) + "\n");
            }
        }
        Files.writeString(path, toFile);
        return n;
    }
}
