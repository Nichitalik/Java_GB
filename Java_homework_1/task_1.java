import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите чичсло: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", (i * (i + 1)) / 2);
        iScanner.close();
    }
}
