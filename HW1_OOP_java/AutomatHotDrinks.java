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
