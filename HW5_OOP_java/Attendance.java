package OOP_HW5;

import java.time.LocalDate;

public class Attendance{
private LocalDate data;
private Boolean attendance;

  public Attendance(LocalDate data, Boolean attendance) {
    this.data = data;
    this.attendance = attendance;
  }

  public LocalDate getData() {
    return data;
  }

  public Boolean getAttend() {
    return attendance;
  }

  @Override
  public String toString() {
    return "{" +
        data +
        ", " + attendance +
        "}";
  }
}
