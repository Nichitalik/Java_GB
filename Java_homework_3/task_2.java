// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package Java_homework_3;

import java.util.ArrayList;

public class task_2 {
    public static void main(String[] args) {
        int[] arr = {1,3,6,24,6452,435,65432,12345, 133333};
        int new_len = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 != 0)
            {
                new_len++;
            }
        }

        print_arr(new_arr(arr, new_len));



        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(Integer.valueOf(i));
        }
        
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) % 2 == 0)
            {
                list.remove(i);
                i--;
            }
        }

        System.out.println(list.toString());
    }

    static void print_arr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] new_arr(int[] arr, int new_len)
    {
        int[] new_arr = new int[new_len];
        
        int i = 0;
        while (i < new_len)
        {
            for (int j : arr) {
                if (j % 2 != 0)
                {
                    new_arr[i] = j;
                    i++;   
                }
            }            
        }

        return new_arr;
    }

}
