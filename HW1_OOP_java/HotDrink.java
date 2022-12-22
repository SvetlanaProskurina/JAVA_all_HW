public class HotDrink {

  protected String name;
  protected String type;
  protected int size;
  protected int price;

  /**
   * @param name  : чай, кофе, какао
   * @param type  : капучино, эспрессо, черный, зеленый, шоколад
   * @param size  : объем
   * @param price : цена
   */
  public HotDrink(String name, String type,int size, int price){
    this.name = name;
    this.type = type;
    this.size = size;
    this.price = price;
  }

  public String getName(){
    return name;
  }

  public String getType(){
    return type;
  }

  public Integer getSize(){
    return size;
  }

  public Integer getPrice(){
    return price;
  }

  public void setName(String name) {
    this.name = name;
  }


  public void setType(String type) {
    this.type = type;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public void setPrice(int price) {
    this.size = price;
  }
}
