import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
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
                break;
            case '-':
                ans = num1 - num2;
                System.out.print(num1 + " " + op + " " + num2 + " = " + ans);
                break;
            case '*':
                ans = num1 * num2;
                System.out.print(num1 + " " + op + " " + num2 + " = " + ans);
                break;
            case '/':
                ans = num1 / num2;
                System.out.print(num1 + " " + op + " " + num2 + " = " + ans);
                break;
            default:
                System.out.println("Нет решения");;
        }
        reader.close();
     }
}