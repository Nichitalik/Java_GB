// В калькулятор добавьте возможность отменить последнюю операцию.

package Java_homework_4;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args)
    {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = reader.nextDouble();
        System.out.print("Введите второе число: ");
        num2 = reader.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch(op) {
            case '+':
                ans = num1 + num2;
                System.out.print(num1 + " " + op + " " + num2 + " = " + ans);
                returnBack(num1);
                break;
            case '-':
                ans = num1 - num2;
                System.out.print(num1 + " " + op + " " + num2 + " = " + ans);
                returnBack(num1);
                break;
            case '*':
                ans = num1 * num2;
                System.out.print(num1 + " " + op + " " + num2 + " = " + ans);
                returnBack(num1);
                break;
            case '/':
                ans = num1 / num2;
                System.out.print(num1 + " " + op + " " + num2 + " = " + ans);
                returnBack(num1);
                break;
            default:
                System.out.println("Нет решения");;
        }
        reader.close();
    }

    static void returnBack(double num)
    {
        Scanner iScanner = new Scanner(System.in);
        int str;
        System.out.println("\nХотите вернуться назад?");
        System.out.print("Введите '1' если согласны: ");
        str = iScanner.nextInt();
        if (str == 1)
        {
            System.out.println(num);
        }
        else System.out.println("завершение программы");
        iScanner.close();
    }
}
