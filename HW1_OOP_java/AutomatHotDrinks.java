import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат и
    реализуйте перегруженный метод getProduct(int name, int volume, int temperature),
    выдающий продукт, соответствующий имени, объему и температуре.
 */
public class AutomatHotDrinks implements VendingAutomat{
  private List<HotDrink> hotDrinks;

  public AutomatHotDrinks(){
    this.hotDrinks = new ArrayList<>();
  }

  public void addHotDrinks(HotDrink hotDrink){
    hotDrinks.add(hotDrink);
  }

  public List<HotDrink> getHotDrinks() {
    return hotDrinks;
  }

  @Override
  public void goodsDelivery() {
    System.out.println("Автомат выдал напиток");
  }

  @Override
  public void moneyAccept() {
    System.out.println("Автомат принял сумму, ожидайте...");
  }

  @Override
  public void change() {
    System.out.println("Идет выдача сдачи");
  }

  // выбор по 4 параметрам
  public void getProduct() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Введите название напитка: ");
    String name = scan.nextLine();
    System.out.print("Введите тип напитка: ");
    String type = scan.nextLine();
    System.out.print("Введите объем напитка:");
    Integer volume = Integer.parseInt(scan.nextLine());
    System.out.print("Введите температуру напитка:");
    Integer temp = Integer.parseInt(scan.nextLine());
    HotDrink HD = new HotDrink("", "", 0, 0);

    for (HotDrink hotdrink : hotDrinks) {
      if (hotdrink instanceof Cocoa) {
        Cocoa hotdrink1 = (Cocoa) hotdrink;
        if (hotdrink1.getName().equalsIgnoreCase(name) && hotdrink1.getType()
            .equalsIgnoreCase(type) && hotdrink1.getSize().equals(volume)
            && hotdrink1.getTemperature().equals(temp)) {
          System.out.print(hotdrink1);
          HD = hotdrink1;
        }
      } else if (hotdrink instanceof Tea) {
        Tea hotdrink2 = (Tea) hotdrink;
        if (hotdrink2.getName().equalsIgnoreCase(name) && hotdrink2.getType()
            .equalsIgnoreCase(type) && hotdrink2.getSize().equals(volume)
            && hotdrink2.getTemperature().equals(temp)) {
          System.out.print(hotdrink2);
          HD = hotdrink2;
        }
      } else if (hotdrink instanceof Cofee) {
        Cofee hotdrink3 = (Cofee) hotdrink;
        if (hotdrink3.getName().equalsIgnoreCase(name) && hotdrink3.getType()
            .equalsIgnoreCase(type) && hotdrink3.getSize().equals(volume)
            && hotdrink3.getTemperature().equals(temp)) {
          System.out.print(hotdrink3);
          HD = hotdrink3;
        }
      }
    }
      System.out.printf("Стоимость товара: %d", HD.getPrice());
      System.out.println("\n Ожиданиие суммы");
      Integer money = Integer.parseInt(scan.nextLine());
      if (money >= HD.getPrice()) {
        moneyAccept();
        System.out.printf("Вот ваш напиток %s \n", HD.getName());
        goodsDelivery();
        int change = money - HD.getPrice();
        if (change > 0) {
          change();
          System.out.printf("Возьмите вашу сдачу %d", change);
        }
      } else {
        moneyAccept();
        System.out.printf("Средств недостаточно для покупки %s", HD.getName());
      }

  }
  // выбор по двум параметрам
  public void buyHotDrink(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Выберите горячий напиток из перечисленных: \n");
    for (HotDrink hotdrink : hotDrinks){
      System.out.printf("%s %s \n", hotdrink.getName(),hotdrink.getType());
    }
    System.out.println();
    String[] request = scan.nextLine().split(" ");
    if (request.length == 2) {
      for (HotDrink hotdrink : hotDrinks) {
        if (hotdrink.getName().equalsIgnoreCase(request[0]) && hotdrink.getType()
            .equalsIgnoreCase(request[1])) {
          System.out.printf("Стоимость товара: %d", hotdrink.getPrice());
          System.out.println("\n Ожиданиие суммы");
          Integer money = Integer.parseInt(scan.nextLine());
          if (money >= hotdrink.getPrice()) {
            moneyAccept();
            System.out.printf("Вот ваш напиток %s \n",hotdrink.getName());
            goodsDelivery();
            int change = money - hotdrink.getPrice();
            if (change > 0){
            change();
            System.out.printf("Возьмите вашу сдачу %d", change);
            }
          } else {
            moneyAccept();
            System.out.printf("Средств недостаточно для покупки %s", hotdrink.getName());
          }
        }
      }
    }else{
      System.out.println("Для заказа напитка надо вводить верное наименование");
      buyHotDrink();
    }
  }
}
