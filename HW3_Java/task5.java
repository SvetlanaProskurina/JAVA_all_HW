//Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> array1= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array1.add(rnd.nextInt(100));
        }

        System.out.printf("Исходный список:  %s\n", array1);


        Iterator<Integer> col = array1.iterator();
        while (col.hasNext())
        {
            if(col.next() % 2 == 0) col.remove();
        }
        System.out.printf("Полученный список:  %s\n", array1);


    }
}