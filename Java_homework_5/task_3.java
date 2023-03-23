package Java_homework_5;

public class task_3{
    public static void main(String[] args)
    {
        int[] arr = {213,342,23,12,5,13,98};

        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


    static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = n / 2  - 1; i >= 0; i--)
        {
            heapfy(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapfy(arr, i, 0);
        }
    }


    static void heapfy(int[] arr, int n, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest])
        {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest])
        {
            largest = r;
        }
        if (largest!= i)
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapfy(arr, n, largest);
        }
    }
}
