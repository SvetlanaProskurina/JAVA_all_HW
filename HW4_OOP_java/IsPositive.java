public class IsPositive<T> implements IsGood<T>{

  @Override
  public boolean isGood(T item) {
    if(item instanceof Integer){
      if ((Integer)item>=0){
        return true;
      }
    }
    return false;
  }
}
