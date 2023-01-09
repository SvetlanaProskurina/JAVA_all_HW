//Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
//    • Он отслеживает текущую позицию в переборе
//    • Он изначально выставлен на конечную позицию
//    • Он движется справа налево
import java.util.Iterator;

public class StudentGroupReverseIterator implements Iterator<Student> {

  private int index;
  private StudentGroup studentGroup;

  public StudentGroupReverseIterator(StudentGroup studentGroup) {
    this.studentGroup = studentGroup;
    this.index = studentGroup.getSize()-1;
  }

  @Override
  public boolean hasNext() {
    return index >= 0;
  }

  @Override
  public Student next() {
    return studentGroup.get(index--);
  }

  public int getIndex() {
    return this.index;
  }
}
