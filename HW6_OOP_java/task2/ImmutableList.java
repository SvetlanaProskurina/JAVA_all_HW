package OOP_HW6.task2;

import java.util.ArrayList;

public class ImmutableList<T>  extends Collection<Integer>{

  public ImmutableList() {
    this.collectionList = new ArrayList<>();
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
