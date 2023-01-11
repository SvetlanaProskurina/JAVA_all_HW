import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
//    boolean isGood (T item);
//    Смысл этого интерфейса: ему дают элемент, он его одобряет или не одобряет.
//    Создайте следующие детские классы:
//    • IsEven — ему дают целое число, он одобряет его, если оно чётное
//    • IsPositive — ему дают целое число, он одобряет его, если оно положительное
//    • BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
//    • BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет,
//    что она начинается с того, что он запомнил
//
//    Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood.
//    Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.
//    Продемонстрируйте, что это работает.
public class Main {

  public static void main(String[] args) {
    IsEven<Integer> testEven = new IsEven();
    System.out.println(testEven.isGood(45));

    IsPositive<Integer> testPositive = new IsPositive();
    System.out.println(testPositive.isGood(5));

    BeginsWithA<String> beginWithA = new BeginsWithA();
    System.out.println(beginWithA.isGood("Анастасия"));

    BeginsWith<String> beginsWith = new BeginsWith<>("Арт");
    System.out.println(beginsWith.isGood("Кто здесь?"));

    System.out.println(filter(new ArrayList<>(Arrays.asList(14,2,-7,8,-3)),testEven));
    System.out.println(filter(new ArrayList<>(Arrays.asList(15,1,-7,8,-3)),testPositive));

    List<String> listString = new ArrayList<>(Arrays.asList("Артист","Ночью","Фонарь светил","Афродита","Апельсин"));

    System.out.println(filter(listString,beginWithA));
    System.out.println(filter(listString,beginsWith));
  }
  public static <T> Iterable<T> filter(Iterable<T> collection,IsGood<T> Test){
    Iterable<T> newCollection = collection;
    Iterator<T> it = newCollection.iterator();
    while(it.hasNext()){
      if(!(Test.isGood(it.next()))) it.remove();
    }
    return newCollection;
  }
}