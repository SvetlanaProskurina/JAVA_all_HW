package itog;// Создайте класс GroupListIterator,
// который позволяет перемещаться по группе в обоих направлениях.
// Он реализует интерфейс ListIterator < student >.
// Добавьте в Группу метод listIterator (),
// который позволяет начать итерацию с помощью GroupListIterator
import java.util.ListIterator;

public class GroupListIterator implements ListIterator <Contragent> {
private int index=0;
private ContragentGroup contragentGroup;
  public GroupListIterator(ContragentGroup contragentGroup) {
    this.contragentGroup = contragentGroup;

  }

  @Override
  public boolean hasNext() {
    return index< contragentGroup.getSize();
  }

  @Override
  public Contragent next() {
      return contragentGroup.get(index++);
  }

  @Override
  public boolean hasPrevious() {
    return contragentGroup.getSize()-1-index>=0;
  }

  @Override
  public Contragent previous() {
    return contragentGroup.get(contragentGroup.getSize() - 1 - index++);
  }

  @Override
  public int nextIndex() {
    return index;
  }

  @Override
  public int previousIndex() {
    return contragentGroup.getSize() - 1 - index;
  }

  @Override
  public void remove() {

  }

  @Override
  public void set(Contragent student) {

  }

  @Override
  public void add(Contragent student) {

  }
}
