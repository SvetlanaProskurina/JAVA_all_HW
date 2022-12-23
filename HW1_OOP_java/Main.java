/*При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования, полиморфизма.

1.Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.

2. Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат и
реализуйте перегруженный метод getProduct(int name, int volume, int temperature),
выдающий продукт, соответствующий имени, объему и температуре.

3. В main проинициализируйте несколько ГорячихНапитков и
АвтоматГорячихНапитков и позвольте покупателю купить товар
*/

public class Main {


  public static void main(String[] args) {
    Cocoa cocoa = new Cocoa("какао","шоколад",300,65, 200);
    Tea greenTea = new Tea("чай","зеленый", 300, 70, 150);
    Tea blackTea = new Tea("чай","черный", 300, 80, 150);
    Tea blackTeaCold = new Tea("чай","черный", 300, 30, 150);
    Cofee cappuccino = new Cofee("кофе","капучино", 300, 65,250);
    Cofee espresso = new Cofee("кофе","эспрессо", 100, 65,220);
    AutomatHotDrinks autoHotDrinks = new AutomatHotDrinks();
    autoHotDrinks.addHotDrinks(cocoa);
    autoHotDrinks.addHotDrinks(greenTea);
    autoHotDrinks.addHotDrinks(blackTea);
    autoHotDrinks.addHotDrinks(cappuccino);
    autoHotDrinks.addHotDrinks(espresso);
    autoHotDrinks.addHotDrinks(blackTeaCold);

    System.out.println("Выберите горячий напиток из перечисленных: \n");
    System.out.println(autoHotDrinks.getHotDrinks());
 //   autoHotDrinks.buyHotDrink();
    autoHotDrinks.getProduct();
  }
}