// Создайте класс GroupListIterator,
// который позволяет перемещаться по группе в обоих направлениях.
// Он реализует интерфейс ListIterator < student >.
// Добавьте в Группу метод listIterator (),
// который позволяет начать итерацию с помощью GroupListIterator
import java.util.Iterator;
import java.util.ListIterator;

public class GroupListIterator implements ListIterator <Student> {
private int index=0;
private StudentGroup studentGroup;
  public GroupListIterator(StudentGroup studentGroup) {
    this.studentGroup = studentGroup;

  }

  @Override
  public boolean hasNext() {
    return index< studentGroup.getSize();
  }

  @Override
  public Student next() {
      return studentGroup.get(index++);
  }

  @Override
  public boolean hasPrevious() {
    return studentGroup.getSize()-1-index>=0;
  }

  @Override
  public Student previous() {
    return studentGroup.get(studentGroup.getSize() - 1 - index++);
  }

  @Override
  public int nextIndex() {
    return index;
  }

  @Override
  public int previousIndex() {
    return studentGroup.getSize() - 1 - index;
  }

  @Override
  public void remove() {

  }

  @Override
  public void set(Student student) {

  }

  @Override
  public void add(Student student) {

  }
}
