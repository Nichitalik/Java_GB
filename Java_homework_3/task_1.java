// Реализовать алгоритм сортировки слиянием


package Java_homework_3;

public class task_1 {
    public static void main(String[] args)
    {
        int[] array = {45, 35 , 6546, 23, -23, -567, 1704};
        print_array(merge_sort(array));
    }

    static void print_array(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int[] merge_arr(int[] arr1, int[] arr2)
    {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length)
        {
            if (arr1[i] < arr2[j])
            {
                arr3[k] = arr1[i];
                i++;
            }
            else
            {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length)
        {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length)
        {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        return arr3;
    }

    static int[] merge_sort(int[] arr)
    {
        if (arr.length <= 1)
        {
            return arr;
        }
        int middle = arr.length / 2;
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];
        for (int i = 0; i < middle; i++)
        {
            left[i] = arr[i];
        }
        for (int i = middle; i < arr.length; i++)
        {
            right[i - middle] = arr[i];
        }
        return merge_arr(merge_sort(left), merge_sort(right));
    }
    
}