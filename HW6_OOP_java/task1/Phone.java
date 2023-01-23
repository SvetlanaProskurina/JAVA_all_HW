package OOP_HW6.task1;

import java.util.ArrayList;
import java.util.List;

public class Phone {
  List <Unlocker> modes = new ArrayList<>();

  public Phone(List<Unlocker> modeList) {
    this.modes = modeList;
  }

  public List<Unlocker> getModeList() {
    return modes;
  }

  public void setModeList(List<Unlocker> modeList) {
    this.modes = modeList;
  }

  @Override
  public String toString() {
    return "Phone{" +
        "modes=" + modes +
        '}';
  }
}
