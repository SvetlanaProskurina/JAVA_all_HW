public class Cocoa extends HotDrink{
  public Integer temperature;
  /**
   * @param name  : чай, кофе, какао
   * @param type  : капучино, эспрессо, черный, зеленый, какао
   * @param size  : объем
   * @param price : цена
   */
  public Cocoa(String name, String type, int size, int temperature, int price) {
    super(name, type, size, price);
    this.temperature = temperature;
  }

  public Integer getTemperature() {
    return temperature;
  }

  public String toString(){
    return String.format("Наименование: %s, тип: %s, объем: %d, температура: %d, цена: %d \n", name, type, size, temperature, price);
  }
}

