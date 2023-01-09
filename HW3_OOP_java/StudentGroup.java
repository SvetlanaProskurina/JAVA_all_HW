//Класс Группа содержит в себе коллекцию Студентов.
// По группе можно перемещаться с помощью итератора.
// (Это повторяет 1-ю задачу из классной работы). Остальные задачи надстраиваются поверх неё.
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentGroup implements Iterable<Student> {

  private List<Student> students;

  public StudentGroup(List<Student> students) {
    this.students = students;
  }
  public Student get(int index) {
    return students.get(index);
  }
  public int getSize() {
    return this.students.size();
  }

  @Override
  public Iterator<Student> iterator() {
    return new GroupListIterator(this);
  }
//  Добавьте в Группу метод listIterator (), который позволяет начать итерацию
//  с помощью GroupListIterator
  public ListIterator<Student> listIterator(){
    return new GroupListIterator(this);
  }
}
