import java.io.*;

//В файле содержится строка с данными:
//
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//
//Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
//
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.
public class task2 {
    public static void main(String[] args) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/datafile2.txt");
            File file = new File(pathFile);

            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();

            StringBuilder sb_ish = new StringBuilder();
            StringBuilder strResult = new StringBuilder();
            sb_ish = new StringBuilder(line);

            String [] mass1 = new String[]{"\"фамилия\":", "\"оценка\":","\"предмет\":"};
            String [] mass2 = new String[]{"Студент ", " получил ", " по предмету "};
            int [] lengthInt = new int[]{10,9,10};
            String [] stMassive = sb_ish.toString().split(", ");

            int indStrStart = 0;
            int indStrEnd = 0;
            for (int i = 0; i < stMassive.length ; i++)
            {
                StringBuilder str = new StringBuilder(stMassive[i]);
                str.deleteCharAt(0);
                str.deleteCharAt(str.length()-1);

                for (int j = 0; j < 3; j++) {

                 indStrStart = str.indexOf(mass1[j]);
                 indStrEnd = indStrStart+lengthInt[j];
                 strResult = str.replace(indStrStart,indStrEnd,mass2[j]);

                }

                System.out.println(strResult.toString().replaceAll("\"","").replaceAll(",",""));

            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}