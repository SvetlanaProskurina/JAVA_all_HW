//Напишите программу, позволяющую анализировать посещаемость студентов. Используйте паттерн MVP.
//    Есть группа студентов. Для каждого студента есть журнал его посещаемости: список дат занятий и для каждой даты — посетил студент занятие или нет.
//    Создайте класс AttendanceService (сервис посещаемости), в котором хранится информация обо всех студентах.
//    Создайте класс AttendanceView, который позволяет отображать студентов и их посещаемость.
//    Создайте класс presenter со следующими функциями:
//    • Распечатать всех студентов и посещаемость каждого в процентах
//    • Распечатать студентов, отсортировав их по убыванию посещаемости (вверху самые посещающие)
//    • Распечатать студентов с посещаемостью ниже 25%

package OOP_HW5;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    AttendanceService as = new AttendanceService();
    AttendanceView av = new AttendanceView();

    Presenter pr = new Presenter(as, av);

    List att1 = new ArrayList<>();
    att1.add(new Attendance(LocalDate.of(2023, 01, 11), false));
    att1.add(new Attendance(LocalDate.of(2022, 12, 29), true));
    att1.add(new Attendance(LocalDate.of(2022, 12, 25), false));
    att1.add(new Attendance(LocalDate.of(2022, 12, 20), false));

    List att2 = new ArrayList<>();
    att2.add(new Attendance(LocalDate.of(2023, 01, 11), true));
    att2.add(new Attendance(LocalDate.of(2022, 12, 29), true));
    att2.add(new Attendance(LocalDate.of(2022, 12, 25), true));
    att2.add(new Attendance(LocalDate.of(2022, 12, 20), false));

    List att3 = new ArrayList<>();
    att3.add(new Attendance(LocalDate.of(2023, 01, 11), false));
    att3.add(new Attendance(LocalDate.of(2022, 12, 29), true));
    att3.add(new Attendance(LocalDate.of(2022, 12, 25), false));
    att3.add(new Attendance(LocalDate.of(2022, 12, 20), false));

    Student student1 = new Student("Петр", "Петров", 245, att1);
    Student student2 = new Student("Иван", "Иванов", 245, att2);
    Student student3 = new Student("Светлана", "Светлова", 245, att3);

    as.addUser(student1);
    as.addUser(student2);
    as.addUser(student3);

    pr.buttonClick();

  }

}
