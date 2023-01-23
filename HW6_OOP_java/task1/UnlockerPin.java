package OOP_HW6.task1;

import OOP_HW6.task1.Unlocker;

public class UnlockerPin implements Unlocker {

  private int pin; // на случай пин-кода
  private int mode;

  public void setPin(int pin) {
    this.pin = pin;
  }

  @Override
  public void GetConfirmUnlock() {
    System.out.println("Введен верный ПИН");
  }


  @Override
  public String toString() {
    return "UnlockerPin{" +
        "pin=" + pin +
        ", mode=" + mode +
        '}';
  }
}
