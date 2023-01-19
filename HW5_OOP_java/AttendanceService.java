package OOP_HW5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AttendanceService {

  private List<Student> studentsList = new ArrayList<>();


  public void addUser(Student student) {
    studentsList.add(student);
  }

  public void removeUser(Student student) {
    studentsList.remove(student);
  }

  @Override
  public String toString() {
    return "AttendanceService{" +
        "studentsList=" + studentsList.toString() +
        '}';
  }

  public List<Student> getList (){
    return studentsList;
  }

}
