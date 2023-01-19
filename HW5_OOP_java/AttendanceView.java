package OOP_HW5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AttendanceView {

  //  private List<Student> studentsList = new ArrayList<>();
  Scanner in = new Scanner(System.in);

  public Integer getActionNumber() {
    System.out.println("Выберите действие:\n 1 - Распечатать всех студентов и посещаемость каждого в процентах \n "+
            "2 - Распечатать студентов, отсортировав их по убыванию посещаемости (вверху самые посещающие) \n "+
            "3 - Распечатать студентов с посещаемостью ниже 25% \n");
    return Integer.parseInt(in.next());
  }

  public HashMap<Student, Integer> getListStudentAttendance(AttendanceService attendanceService) {
    List<Student> studentsList = attendanceService.getList();
    HashMap<Student, Integer> stMapLowAttendance = new HashMap<>();
    Integer attendance;
    for (Student st : studentsList) {
      attendance = 0;
      for (Attendance at : st.getAttendance()) {
        if (at.getAttend().equals(true)) {
          attendance++;
        }
      }
      int percent = attendance * 100 / st.getAttendance().size();
      stMapLowAttendance.put(st, percent);
    }
    return stMapLowAttendance;
  }

  // весь список студентов
  public void PrintList(List<Student> data) {
    for (Student st : data) {
      System.out.println(st);
    }
  }

  //   весь список студентов c процентом посещаемости
  public void PrintListAttendance(AttendanceService attendanceService) {
    HashMap<Student, Integer> ListStudentAttendance = getListStudentAttendance(attendanceService);
    for (HashMap.Entry<Student, Integer> stEntry : ListStudentAttendance.entrySet()) {
      System.out.printf("%s, Процент посещения %d ,\n", stEntry.getKey(), stEntry.getValue());
    }
  }

  //  список студентов с посещаемостью 25% и ниже
  public void ListLowAttendance(AttendanceService attendanceService) {
    HashMap<Student, Integer> ListStudentAttendance = getListStudentAttendance(attendanceService);
    for (HashMap.Entry<Student, Integer> stEntry : ListStudentAttendance.entrySet()) {
      if (stEntry.getValue() <= 25) {
        System.out.printf("%s, Процент посещения %d \n", stEntry.getKey(), stEntry.getValue());
      }
    }
  }

  public void SortIncreaseListAttendance(AttendanceService attendanceService) {
    Map<String, Integer> SortStudentAttendance = new TreeMap<>();
    List<Student> stList = attendanceService.getList();
    List<String> sortArrayListStudent = new ArrayList<>();
    for (Student st : stList) {
      int attendance = 0;
      for (Attendance at : st.getAttendance()) {
        if (at.getAttend().equals(true)) {
          attendance++;
        }
      }
      SortStudentAttendance.put(st.toString(), attendance);
    }
    for (String st : SortStudentAttendance.keySet()) {
      sortArrayListStudent.add(st);
    }
    for (int i = 0; i <sortArrayListStudent.size() ; i++) {
      System.out.println(sortArrayListStudent.get(i));
    }

  }

}
