package Java_homework_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Laptop {
    String model;
    int RAM;
    int HDD;
    String OS;
    String color;
    int price;

    public Laptop(String model, int RAM, int HDD, String OS, String color, int price)
    {
        this.model = model;
        this.RAM = RAM;
        this.HDD = HDD;
        this.OS = OS;
        this.color = color;
        this.price = price;
    }


    public String get_Model()
    {
        return model;
    }

    public int get_RAM()
    {
        return RAM;
    }

    public int get_HDD()
    {
        return HDD;
    }

    public String get_OS()
    {
        return OS;
    }

    public String get_Color()
    {
        return color;
    }

    public int get_Price()
    {
        return price;
    }

    public static ArrayList<Laptop> laptops = new ArrayList<Laptop>();

    static void filter_RAM()
    {
        Scanner rScanner = new Scanner(System.in);
        System.out.println("Enter the RAM size");
        int RAM = rScanner.nextInt();
        rScanner.close();
        for (int i = 0; i < laptops.size(); i++)
        {
            if (laptops.get(i).get_RAM() < RAM)
            {
                laptops.remove(i);
                i--;
            }
        }
    }

    static void filter_HDD()
    {
        Scanner hScanner = new Scanner(System.in);
        System.out.println("Enter the HDD size");
        int HDD = hScanner.nextInt();
        hScanner.close();
        for (int i = 0; i < laptops.size(); i++)
        {
            if (laptops.get(i).get_HDD() < HDD)
            {
                laptops.remove(i);
                i--;
            }
        }
    }

    static void filter_OS()
    {
        Scanner oScanner = new Scanner(System.in);
        System.out.println("Enter the OS(Windows, Linux, MacOS)");
        String OS = oScanner.next();
        oScanner.close();
        for (int i = 0; i < laptops.size(); i++)
        {
            if (laptops.get(i).get_OS().equals(OS) == false)
            {
                laptops.remove(i);
                i--;
            }
        }
    }

    static void filter_Color()
    {
        Scanner cScanner = new Scanner(System.in);
        System.out.println("Enter the color");
        String color = cScanner.next();
        cScanner.close();
        for (int i = 0; i < laptops.size(); i++)
        {
            if (laptops.get(i).get_Color().equals(color) == false)
            {
                laptops.remove(i);
                i--;
            }
        }
    }

    static void filter_price()
    {
        Scanner pScanner = new Scanner(System.in);
        System.out.println("Enter the price");
        int price = pScanner.nextInt();
        pScanner.close();
        for (int i = 0; i < laptops.size(); i++)
        {
            if (laptops.get(i).get_Price() > price)
            {
                laptops.remove(i);
                i--;
            }
        }
    }


    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        // HashMap<String, String> n = new HashMap<>();
        // n.put("1", "RAM");
        // n.put("2", "HDD");
        // n.put("3", "OS");
        // n.put("4", "Color");
        // n.put("5", "price");

        Laptop laptop1 = new Laptop("HP", 1000, 2000, "Windows", "Black", 100000);
        Laptop laptop2 = new Laptop("Lenovo", 2000, 3000, "Windows", "Green", 200000);
        Laptop laptop3 = new Laptop("Samsung", 3000, 4000, "Windows", "Red", 300000);
        Laptop laptop4 = new Laptop("Apple", 4000, 5000, "MacOS", "Gold", 1000000);
        Laptop laptop5 = new Laptop("Huawei", 1000, 2000, "Windows", "Black", 100000);
        Laptop laptop6 = new Laptop("LG", 1000, 2000, "Linux", "Black", 200000);
        Laptop laptop7 = new Laptop("Nokia", 1000, 2000, "Linux", "Red", 300000);

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        laptops.add(laptop7);

        for (Laptop laptop : laptops)
        {
            System.out.print("Model: " + laptop.get_Model() + ", ");
            System.out.print("RAM: " + laptop.get_RAM() + ", ");
            System.out.print("HDD: " + laptop.get_HDD() + ", ");
            System.out.print("os: " + laptop.get_OS() + ", ");
            System.out.print("Color: " + laptop.get_Color() + ", ");
            System.out.println("Price: " + laptop.get_Price() + "\n");
        }

        System.out.println("Выбор минимальных значений: ");
        System.out.print("Введите нужные цифры через пробел:\n1 - RAM\n2 - HDD\n3 - OS\n4 - Color\n5 - price(Максимальная)\n"); // вводим нужные цифры через пробел
        String choice = iScanner.nextLine();
        for (String c : choice.split(" ")) {
            switch (c) {
                case "1":
                    filter_RAM();
                    break;
                case "2":
                    filter_HDD();
                    break;
                case "3":
                    filter_OS();
                    break;
                case "4":
                    filter_Color();
                    break;
                case "5":
                    filter_price();
                    break;
                default:
                    break;
            }
        }

        for (Laptop laptop : laptops)
        {
            System.out.print("Model: " + laptop.get_Model() + ", ");
            System.out.print("RAM: " + laptop.get_RAM() + ", ");
            System.out.print("HDD: " + laptop.get_HDD() + ", ");
            System.out.print("os: " + laptop.get_OS() + ", ");
            System.out.print("Color: " + laptop.get_Color() + ", ");
            System.out.println("Price: " + laptop.get_Price() + "\n");
        }


        iScanner.close();
    }
}