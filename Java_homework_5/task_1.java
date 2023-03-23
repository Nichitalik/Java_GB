// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.


package Java_homework_5;

import java.util.HashMap;
import java.util.LinkedList;

public class task_1 {
    
    private static HashMap<String, LinkedList<String>> phone_book = new HashMap<>();

    public static void main(String[] args)
    {
        String[] name = 
        {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов"
        };

        for (int i = 0; i < name.length; i++)
        {
            phone_book.put(name[i], new LinkedList<>());
        }

        System.out.println(phone_book + "\n");

        add_number("Иван Иванов", "123456789");
        add_number("Светлана Петрова", "123456789");
        add_number("Кристина Белова", "123456789");
        add_number("Анна Мусина", "123456789");
        add_number("Анна Крутова", "123456789");
        add_number("Иван Юрин", "123456789");
        add_number("Петр Лыков", "123456789");
        add_number("Павел Чернов", "123456789");

        System.out.println(phone_book + "\n");

        add_number("Иван Иванов", "123876789");
        add_number("Светлана Петрова", "123676789");
        add_number("Кристина Белова", "121234589");
        add_number("Анна Мусина", "999456789");

        System.out.println(phone_book + "\n");

        remove_number("Анна Мусина", "212343q34w5");
        remove_number("Анна Мусина", "999456789");

        System.out.println(phone_book + "\n");

    }


    static void add_number(String name, String number)   // добавление номера телефона
    {
        if (phone_book.containsKey(name))
        {
            phone_book.get(name).add(number);
        }
        else
        {
            phone_book.put(name, new LinkedList<>());
            phone_book.get(name).add(number);
        }
    }


    static void remove_number(String name, String number)   // удаление номера телефона
    {
        if (phone_book.containsKey(name))
        {
            if (phone_book.get(name).contains(number))
            {
                phone_book.get(name).remove(number);
            }
            else
            {
                System.out.println("Телефон не найден");
            }
        }
        else
        {
            System.out.println("Телефон не найден");
        }
    }
}
