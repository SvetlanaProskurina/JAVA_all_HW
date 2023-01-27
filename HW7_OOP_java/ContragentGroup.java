package itog;

import java.util.Iterator;
import java.util.List;

public class ContragentGroup implements Iterable<Contragent> {

  private List<Contragent> contragents;

  public ContragentGroup(List<Contragent> contragents) {
    this.contragents = contragents;
  }

  public Contragent get(int index) {
    return contragents.get(index);
  }

//  public void delete(){
//    contragents.remove(contragents.get())
//  }
  public int getSize() {
    return this.contragents.size();
  }

  public List<Contragent> getListContragent() {
    return contragents;
  }

  @Override
  public Iterator<Contragent> iterator() {
    return new GroupListIterator(this);
  }

}
