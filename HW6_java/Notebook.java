import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Класс описывает ноутбуки
 */
public class Notebook {

  String maker;       // производитель
  String color;       // цвет
  String OS;          // операционная система
  int disk;            // Диск
  int RAM;            // оперативка
  double frequency;      // частота
  int price;
  int ID; // ID ноутбука

  /**
   * toString для экземпляра класса Notebook
   *
   * @return String.format...
   */
  @Override
  public String toString() {
    return String.format("%s, %s, %s, %s, %s, %s, %s, %s", ID, maker, disk, RAM, frequency, OS,
        color, price);
  }

  public Map<Object, Object> parametrsMap() {
    Map<Object, Object> parametrsNotebook = new HashMap<>();
    parametrsNotebook.put("ID", ID);
    parametrsNotebook.put("maker", maker);
    parametrsNotebook.put("color", color);
    parametrsNotebook.put("OS", OS);
    parametrsNotebook.put("disk", disk);
    parametrsNotebook.put("RAM", RAM);
    parametrsNotebook.put("frequency", frequency);
    parametrsNotebook.put("price", price);

    return parametrsNotebook;
  }

  /**
   * Setter для экземпляра класса ноутбук. заполняет или изменяет созданный ранее экземпляр.
   *
   * @param IDs        - ИД ноутбука
   * @param makers     - Брэнд производителя ноутбука
   * @param RAMs       - размер оперативной памяти в ГБ.
   * @param disks      - объём жёсткого диска в ГБ.
   * @param OSs        - операционная система
   * @param colors     - цвет корпуса ноутбука
   * @param frequencys - частота  ghjwtccjhf (ГГц)
   * @param prices     - цена в рублях.
   */
  public void setParams(int disks,
      int IDs,
      int prices,
      int RAMs,
      double frequencys,
      String makers,
      String OSs,
      String colors) {
      if (IDs > 0) {
          ID = IDs;
      } else {
          Random rnd = new Random();
          ID = rnd.nextInt(1000, 100000);
      }
      if (RAMs > 0) {
          RAM = RAMs;
      } else {
          RAM = 0;
      }
      if (disks > 0) {
          disk = disks;
      } else {
          disk = 0;
      }
    maker = makers;
    OS = OSs;
    color = colors;
    frequency = frequencys;
    price = prices;

  }
}