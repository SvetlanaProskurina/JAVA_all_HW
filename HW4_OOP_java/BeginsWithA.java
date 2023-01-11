public class BeginsWithA<T> implements IsGood<T>{

  @Override
  public boolean isGood(T str) {
      if (((String) str).startsWith("А")){
        return true;
      }
    return false;
  }
}
