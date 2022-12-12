
import java.util.LinkedList;
import java.util.Random;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class task8 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        Random rnd = new Random();

        //заполнение листа
        for (int i = 0; i < 5; i++) {
            ll.add(rnd.nextInt(10));
        }

        System.out.printf("Исходный список:  %s\n", ll);


        for (int i = 0; i < ll.size() - 1; i++) {
            ll.add(i, ll.pollLast());
        }
        System.out.printf("Обратный список:  %s\n", ll);

    }
}
