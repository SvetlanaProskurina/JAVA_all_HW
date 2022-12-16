/*Реализовать алгоритм пирамидальной сортировки (HeapSort).*/

import java.util.Arrays;

public class task13 {
    public static void sort(int arr[])
    {
        int len = arr.length; // изначальный размер массива

        for (int i = len / 2 - 1; i >= 0; i--) {
            heapify(arr, len, i);
        }
        for (int i = len - 1; i >= 0; i--) // уменьшаем длину для сортировки
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }


    public static void heapify(int arr[], int n, int i)
    {
        int indMax = i; //  индекс максимального элмента
        int indLchild = 2*i + 1; // левая ветка индекс
        int indRchild = 2*i + 2; // правай ветка индекс

        if (indLchild < n && arr[indLchild] > arr[indMax]){
            indMax = indLchild;
        }
        if (indRchild < n && arr[indRchild] > arr[indMax]) {
            indMax = indRchild;
        }

        if (indMax != i)  // ставим в вершину треугольника максимальный элемент
        {
            int temp = arr[i];
            arr[i] = arr[indMax];
            arr[indMax] = temp;

            heapify(arr, n, indMax); // надо пройти все треугольники до конца
        }
    }


    public static void main(String args[])
    {
        int arr[] = {2, 12, 4, 8, 13, 5, 4, 16, 11, 1, 7, 15, 1, 2, 8, 6};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr));

        sort(arr);

        System.out.println("Сортированный массив:");
        System.out.println(Arrays.toString(arr));
    }
}
