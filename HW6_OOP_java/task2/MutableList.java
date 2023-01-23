package OOP_HW6.task2;

import java.util.ArrayList;

public class MutableList<T> extends Collection<Integer> {


  public MutableList() {
    this.collectionList = new ArrayList<>();
  }
  public void set(int i, int val) {

    collectionList.add(val);
  }

  public void add(int val) {
    collectionList.add(val);
  }

  public void remove(int val) {
    collectionList.remove(val);
  }

  @Override
  public void getSize() {
    System.out.println(collectionList.size());
  }

  @Override
  public void get(int i) {
    System.out.println(collectionList.get(i));
  }
}
