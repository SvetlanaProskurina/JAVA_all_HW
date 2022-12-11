import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Iterator;
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

public class task6 {


    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> listAr = new ArrayList<>();
        //заполнение листа
        for (int i = 0; i < 10; i++) {
            listAr.add(rnd.nextInt(100));
        }

        System.out.printf("Исходный список:  %s\n", listAr);
        findMinMaxAverage(listAr);

    }
    public static void findMinMaxAverage(ArrayList<Integer> listArr) {
        Iterator<Integer> col = listArr.iterator();
        int min = listArr.get(0);
        int max = listArr.get(0);
        double res = 0;

        while (col.hasNext()) {
            int i = col.next();
            if (i < min) min = i;
            if (i > max) max = i;
            res = res + i;
        }

        double average = res / listArr.size();

        System.out.printf("Минимальное значение из списка: %s\n", min);
        System.out.printf("Максимальное значение из списка: %s\n", max);
        System.out.printf("Среднеарифметическое значение элементов списка: %.2f\n",average);

        double averageTst = listArr.stream().mapToInt(Integer::intValue).average().getAsDouble();

        System.out.printf("Минимальное значение из списка: %s\n", Collections.min(listArr));
        System.out.printf("Максимальное значение из списка: %s\n", Collections.max(listArr));
        System.out.printf("Среднеарифметическое значение элементов списка: %f\n", averageTst);

    }
}
