package OOP_HW5;

import java.util.List;

public class Student{
  private String name;
  private String surname;
  private int groupNumber;

  private List<Attendance> attendance;

  public Student(String name, String surname, int groupNumber, List<Attendance> attendance) {
    this.name = name;
    this.surname = surname;
    this.groupNumber = groupNumber;
    this.attendance = attendance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public int getGroupNumber() {
    return groupNumber;
  }

  public void setGroupNumber(int groupNumber) {
    this.groupNumber = groupNumber;
  }

  public List<Attendance> getAttendance() {
    return attendance;
  }

  public void setAttendance(List<Attendance> attendance) {
    this.attendance = attendance;
  }


  @Override
  public String toString() {
    return "Student" +
        "name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", groupNumber=" + groupNumber +
        ", attendance=" + attendance;
  }
}
