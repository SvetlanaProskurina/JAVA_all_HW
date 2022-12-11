import java.util.Arrays;
import java.util.Random;

//Реализовать алгоритм сортировки слиянием

public class task4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array1 = new int[15];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rnd.nextInt(100);
        }
        System.out.printf("Исходный массив: %s\n", Arrays.toString(array1));

        int[] result = mergeSort(array1);
        System.out.printf("Отсортированный массив: %s\n",Arrays.toString(result));
    }

    public static int[] mergeSort(int[] array1)
    {
        int[] buffer1 = Arrays.copyOf(array1, array1.length); // копируем массив исходный
        int[] buffer2 = new int[array1.length]; // пустой массив длиной равный исходному

        int[] result = sortArr(buffer1, buffer2, 0, array1.length);
        return result;
    }

    public static int[] sortArr(int[] buffer1, int[] buffer2, int startIndex, int endIndex)
    {

        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2; // вычисляем конец и начало (индексы) для двух массивов

        int[] arrFirst = sortArr(buffer1, buffer2, startIndex, middle);
        int[] arrSecond = sortArr(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int indexNew = startIndex;

        int[] result  = new int[]{};

        if (arrFirst == buffer1) {
            result = buffer2;
        }
        else {result = buffer1;}

        while (index1 < middle && index2 < endIndex) {

            if (arrFirst[index1] < arrSecond[index2])
            {
                result[indexNew]=arrFirst[index1];
                indexNew++;
                index1++;
            }
            else
            {
                result[indexNew]=arrSecond[index2];
                indexNew++;
                index2++;
            }

        }

        while (index1 < middle)
        {
            result[indexNew] = arrFirst[index1];
            indexNew++;
            index1++;
        }

        while (index2 < endIndex)
        {
            result[indexNew] = arrSecond[index2];
            indexNew++;
            index2++;
        }

        return result;
    }
}