package OOP_HW6.task2;

import java.util.ArrayList;

public class MutableList<T> extends Collection<Integer> {


  public MutableList() {
    this.collectionList = new ArrayList<>();
  }
  public void set(int i, int newVal) {

    collectionList.set(i,newVal);
  }

  public void add(int newVal) {
    collectionList.add(newVal);
  }

  public void remove(int i) {
    collectionList.remove(i);
  }

  @Override
  public void getSize() {
    collectionList.size();
  }

  @Override
  public void get(int i) {
    System.out.println(collectionList.get(i));
  }


  public void print() {
    for (Integer in : collectionList){
      System.out.print(in + " ");}
  }
}
