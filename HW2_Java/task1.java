// В файле содержится строка с исходными данными в такой форме: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
//SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
//Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.regex.Pattern;

public class task1 {


    public static void main(String[] args) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/datafile.txt");
            File file = new File(pathFile);

            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();

            String sqlLine = new String();
            StringBuilder sb_ish = new StringBuilder();

// создаю новую строку с запросом


           while (line != null) {

               StringBuilder sb = new StringBuilder("SELECT * FROM students WHERE");
                // преобразуем line в stringbuilder
                sb_ish = new StringBuilder(line);
                // удаляю первую и последнюю скобку из строки
                sb_ish.deleteCharAt(0);
                sb_ish.deleteCharAt(sb_ish.length()-1);

                char sreg1 = '"';

                // разбиваю стоку
                String[] words = sb_ish.toString().split(", ");
                String pattern1 = "\"="; // "  это регулярное выражение;
                Pattern pat1 = Pattern.compile(pattern1);

                String pattern2 = "\"\s";
                Pattern pat2 = Pattern.compile(pattern2);
                for (String word : words)

                {
                    if (word.contains("null") != true)
                    {
                        String new_word1 = word.replace(':', '=').replaceFirst(String.valueOf(sreg1), " ");
                        sb.append(new_word1.replaceFirst(String.valueOf(pat1)," = "));
                    }

                }

            sqlLine = sb.toString().replaceAll(String.valueOf(pat2),"\" AND ");
            System.out.println(sqlLine);
                // считываем остальные строки в цикле
                line = reader.readLine();
               sb.setLength(0);
           }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}