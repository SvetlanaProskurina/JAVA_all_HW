package OOP_HW6.task2;

//import OOP_HW6.task1.BasePhone;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    ImmutableList<Integer> integerImmutableList = new ImmutableList<>();
    integerImmutableList.collectionList = new ArrayList<>(Arrays.asList(1, 2, 3));
    integerImmutableList.getSize();
    integerImmutableList.get(0);

    MutableList<Integer> integerMutableList = new MutableList<>();
    integerMutableList.collectionList = new ArrayList<>(Arrays.asList(1, 2, 3));
    integerMutableList.add(4);
    integerMutableList.print();
    System.out.println();
    integerMutableList.remove(2);
    integerMutableList.print();
    System.out.println();
    integerMutableList.set(2, 78);
    integerMutableList.print();
  }
}
