/*Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу,
которая найдет и выведет повторяющиеся имена с количеством повторений.
 Отсортировать по убыванию популярности.*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;


public class  task12 {
    public static void main(String[] args) {
        int count;
        ArrayList<String> persons = new ArrayList<String>(Arrays.asList("Иван Иванов", "Петр Петров", "Алексей Алексеев",
                "Светлана Проскурина", "Александр Александров", "Иван Петров", "Петр Иванов", "Светлана Светлая", "Алексей Проскурин",
                "Екатерина Новая", "Екатерина Александрова", "Антон Антонов", "Антон Егоров", "Светлана Светличная", "Петр Круглов", "Алексей Александров"));

        String[] arrayNames = new String[2];

        HashMap<String, Integer> names = new HashMap<>();

        for (String lst : persons) {
            arrayNames = lst.split(" ");

            if (names.containsKey(arrayNames[0])) {

                count = names.get(arrayNames[0]) + 1;
                names.put(arrayNames[0], count);
            } else {
                names.put(arrayNames[0], 1);
            }
        }
// созздаем список строк, чтобы можно было отсортировать

        ArrayList<String> nameList = new ArrayList<>();

        for (HashMap.Entry<String, Integer> entry : names.entrySet()) {
            nameList.add(entry.getValue() + " - " + entry.getKey());
        }
        //сортируем по убыванию популярности
        Collections.sort(nameList);
        Collections.reverse(nameList);

        for (String str : nameList) {
            System.out.println(str);
        }
        System.out.println();
    }
}