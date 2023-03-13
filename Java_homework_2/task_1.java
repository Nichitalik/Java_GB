// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package Java_homework_2;

import java.util.LinkedHashMap;
import java.util.Map;

public class task_1 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("select * from students where ");

        Map<String, String> json = new LinkedHashMap<>();
        json.put("name","Ivanov");
        json.put("country","Russia");
        json.put("city","Moscow");
        json.put("age",null);

        System.out.println(where(json));
    }

    static String where(Map<String, String> param)
    {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, String> pair : param.entrySet()) {
            if (pair.getKey() == null || pair.getValue() == null)
                continue;

                result.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
        }

        if (result.length() > 5)
        result.delete(result.length() - 5, result.length());

        return result.toString();
    }
}
