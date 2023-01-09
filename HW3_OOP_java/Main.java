import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

  public static void main(String[] args) {

    List<Student> listStudents = new ArrayList<>();
    listStudents.add(new Student("Иванов", 20, 4.8f));
    listStudents.add(new Student("Петров", 21, 4.1f));
    listStudents.add(new Student("Сидоров", 19, 5.0f));
    listStudents.add(new Student("Козлов", 20, 3.1f));

// создаем список студентов типа StudentGroup
    StudentGroup studentGroup = new StudentGroup(listStudents);
// создаем итерируемый объект
    Iterator<Student> it = studentGroup.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    System.out.println("-------------------------------");

// создаем итерируемый объект
    ListIterator<Student> listIt = studentGroup.listIterator();
    while (listIt.hasNext()) {
      System.out.println(listIt.nextIndex() + " : " + listIt.next());
    }
    System.out.println("-------------------------------");

// создаем итерируемый объект
    StudentGroupReverseIterator listItRev = new StudentGroupReverseIterator(studentGroup);
    while (listItRev.hasNext()) {
      System.out.println(listItRev.getIndex() + " : " + listItRev.next());
    }
    System.out.println("-------------------------------");

//    ListIterator<Student> listIt2 = studentGroup.listIterator();
//
//    while (listIt2.hasPrevious()) {
//      System.out.println("Index is: " + listIt2.previousIndex() + " : " + listIt2.previous());
//    }
  }
}