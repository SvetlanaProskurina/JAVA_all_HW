//Создайте класс presenter со следующими функциями:
//    • Распечатать всех студентов и посещаемость каждого в процентах
//    • Распечатать студентов, отсортировав их по убыванию посещаемости (вверху самые посещающие)
//    • Распечатать студентов с посещаемостью ниже 25%
package OOP_HW5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Presenter {

  AttendanceService attendanceService;
  AttendanceView attendanceView;

  public Presenter(AttendanceService attendanceService, AttendanceView attendanceView) {
    this.attendanceService = attendanceService;
    this.attendanceView = attendanceView;
  }

  public void buttonClick() {
    int number = attendanceView.getActionNumber();
    if (number == 1) {
      attendanceView.PrintListAttendance(attendanceService);
    }else if (number == 2) {
      attendanceView.SortIncreaseListAttendance(attendanceService);
    }else  attendanceView.ListLowAttendance(attendanceService);
    }


}
