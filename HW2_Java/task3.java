import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class task3
{
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(loggingg.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

//        //logger.setLevel(Level.INFO);
//        logger.log(Level.WARNING, "Тестовое логирование 1");

        StringBuilder arr = new StringBuilder();
        int[] intArray = new int[]{1,5,6,3,8,45,21,12,22};
        int len = intArray.length;
        int temp = 0;
        for (int i = 0; i < len; i++)
        {
            for (int j = 1; j < (len - i); j++)
            {
                if (intArray[j - 1] > intArray[j])
                {
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }

            }
            logger.info(" итерация №" + i + " " + arr.append(intArray[i] + " "));
            System.out.print(intArray[i] + " ");
        }

    }
}
