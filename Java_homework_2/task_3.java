// Дана json строка (можно сохранить в файл и читать из файла) 
// [
//     {"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
//     {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//     {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}
// ]
// Написать метод(ы), который распарсит json и, используя StringBuilder,
// создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


package Java_homework_2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class task_3 {
    public static void main(String[] args) throws IOException {
        String path =  "C:/Users/nikit/Desktop/обучение/geek_education/Java_homework/Java_homework_2/task_3_input.txt";
        String read = readFile(path);

        read = read.replace("[{", "");
        read = read.replace("}]", "");
        read = read.replace("\"", "");
        read = read.replace("фамилия:", "");
        read = read.replace("оценка", "");
        read = read.replace("предмет", "");
        read = read.replaceAll(",", "");

        String[] split = read.split("\\}\\{");
        String[][] word = new String[split.length][3];

        String[] form = {"Студент ", " получил ", " по предмету "};

        for (int i = 0; i < split.length; i++)
        {
            word[i] = split[i].split(":");
        }

        
        for (int i = 0; i < word.length; i++)
        {
            StringBuilder result = new StringBuilder();
            for (int j = 0; j < word[i].length; j++)
            {
                result.append(form[j]).append(word[i][j]);
            }
            result.append(".");
            System.out.println(result.toString());
        }
        
    }

    static String readFile(String path) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
        String str;
        str = br.readLine();
        br.close();
        
        return str;
    }
}
