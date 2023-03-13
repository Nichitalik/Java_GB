// К калькулятору из предыдущего дз добавить логирование


package Java_homework_2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_4 {
    

    public static void main(String[] args) throws SecurityException, IOException {

        Logger log = Logger.getLogger(task_4.class.getName());
        log.setLevel(Level.ALL);
        ConsoleHandler fh = new ConsoleHandler();
        log.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);



        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = reader.nextDouble();
        log.log(Level.INFO, "введено первое число: " + num1);
        System.out.print("Введите второе число: ");
        num2 = reader.nextDouble();
        log.log(Level.INFO, "введено второе число: " + num2);
        System.out.print("Введите оператор (+, -, *, /): ");
        op = reader.next().charAt(0);
        log.log(Level.INFO, "введен оператор: " + op);
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
        log.log(Level.INFO, "Завершение выполнения программы");
        reader.close();
     }
}