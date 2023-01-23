package OOP_HW6.task1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
  public static void main(String[] args){
    List<Unlocker> modesUnlockerList = new ArrayList<>(Arrays.asList(new UnlockerFree(),
        new UnlockerPin(), new UnlockerFingerprint(), new UnlockerFaceID()));

    Phone phone = new Phone(modesUnlockerList);
    System.out.println(phone);

  }
}
