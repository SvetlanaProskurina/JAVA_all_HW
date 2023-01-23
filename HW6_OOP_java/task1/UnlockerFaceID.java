package OOP_HW6.task1;

import OOP_HW6.task1.Unlocker;

public class UnlockerFaceID implements Unlocker {

  private String faceID;
  private int mode;

  public void setFaceID(String faceID) {
    this.faceID = faceID;
  }

  @Override
  public void GetConfirmUnlock() {
    System.out.println("Лицо распознано \n");
  }

  @Override
  public String toString() {
    return "UnlockerFaceID{" +
        "faceID='" + faceID + '\'' +
        '}';
  }
}
