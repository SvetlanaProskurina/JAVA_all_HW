public class BeginsWith<T> implements IsGood<T>{
private T line;

  public BeginsWith(T line) {
    this.line = line;
  }

  @Override
  public boolean isGood(T txt) {
    int lineLength = ((String)line).length();
    if (((String)txt).startsWith((String) line,0)) {
      return true;
    }
    return false;
  }

}
