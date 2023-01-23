package OOP_HW6.task1;

import OOP_HW6.task1.Unlocker;

public class UnlockerFingerprint implements Unlocker {

  private String fingerprint;
  private int mode;

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  @Override
  public void GetConfirmUnlock() {
    System.out.println("Отпечаток пальца подтверждён \n");
  }

  @Override
  public String toString() {
    return "UnlockerFingerprint{" +
        "fingerprint='" + fingerprint + '\'' +
        '}';
  }
}
