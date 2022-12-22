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
    HotDrink cocoa = new Cocoa("какао","шоколад",300,65, 200);
    HotDrink greenTea = new Tea("чай","зеленый", 300, 70, 150);
    HotDrink blackTea = new Tea("чай","черный", 300, 80, 150);
    HotDrink cappuccino = new Cofee("кофе","капучино", 300, 65,250);
    HotDrink espresso = new Cofee("кофе","эспрессо", 100, 65,220);
    AutomatHotDrinks autoHotDrinks = new AutomatHotDrinks();
    autoHotDrinks.addHotDrinks(cocoa);
    autoHotDrinks.addHotDrinks(greenTea);
    autoHotDrinks.addHotDrinks(blackTea);
    autoHotDrinks.addHotDrinks(cappuccino);
    autoHotDrinks.addHotDrinks(espresso);

    System.out.println(autoHotDrinks.getHotDrinks());
    autoHotDrinks.buyHotDrink();
  }
}