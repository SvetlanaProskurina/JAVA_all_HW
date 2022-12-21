/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
**/
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Notebook notebook1 = new Notebook();
        notebook1.ID = 1;
        notebook1.maker = "Dell";
        notebook1.color= "black";
        notebook1.disk = 512;
        notebook1.frequency = 1.5;
        notebook1.RAM = 8;
        notebook1.OS = "Windows";
        notebook1.price = 45000;

        Notebook notebook2 = new Notebook();
        notebook2.ID = 2;
        notebook2.maker= "Acer";
        notebook2.color= "black";
        notebook2.disk = 512;
        notebook2.frequency = 2.7;
        notebook2.RAM = 16;
        notebook2.OS = "Windows";
        notebook2.price = 75000;


        Notebook notebook3 = new Notebook();
        notebook3.ID = 3;
        notebook3.maker = "Lenovo";
        notebook3.color= "grey";
        notebook3.disk = 256;
        notebook3.frequency = 1.5;
        notebook3.RAM = 8;
        notebook3.OS = "Linux";
        notebook3.price = 35000;


        Notebook notebook4 = new Notebook();
        notebook4.ID = 4;
        notebook4.maker = "Apple";
        notebook4.color= "white";
        notebook4.disk = 512;
        notebook4.frequency = 2.8;
        notebook4.RAM = 16;
        notebook4.OS = "MacOS";
        notebook4.price = 95000;

        ArrayList<Notebook> notebookArrayList = new ArrayList<>();
        notebookArrayList.add(notebook1);
        notebookArrayList.add(notebook2);
        notebookArrayList.add(notebook3);
        notebookArrayList.add(notebook4);

        searching(notebookArrayList, request());
    }

    private static HashMap<String, String> request() {
        Scanner scans = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
// инициализация map


        String inscan;

            System.out.println("Введите цифру, или несколько через запятую," +
                    "соответствующих необходимым критериям фильтрации:  " +
                    "1 - Производитель, " +
                    "2 - Операционная система, " +
                    "3 - Оперативная память RAM, " +
                    "4 - Объем жесткого диска, " +
                    "5 - Частота процессора, " +
                    "6 - цвет, " +
                    "7 - стоимость");
            String[] input = scans.nextLine().split(",");


                for (String s : input) {
                    if (s.equalsIgnoreCase("1")) {
                        System.out.println("Введите искомое значение параметра: производитель:  ");
                        inscan = scans.nextLine();
                        if (inscan != "")
                            map.put("maker", inscan);
                    }

                    if (s.equalsIgnoreCase("2")) {
                        System.out.println("Введите искомое значение параметра: операционная система:  ");
                        inscan = scans.nextLine();
                        if (inscan != "")
                            map.put("OS", inscan);
                    }

                    if (s.equalsIgnoreCase("3")) {
                        System.out.println("Введите искомое значение параметра: Оперативная память RAM  ");
                        inscan = scans.nextLine();
                        if (inscan != "")
                            map.put("RAM", inscan);
                    }

                    if (s.equalsIgnoreCase("4")) {
                        System.out.println("Введите искомое значение параметра: объем диска ");
                        inscan = scans.nextLine();
                        if (inscan != "")
                            map.put("disk", inscan);
                    }

                    if (s.equalsIgnoreCase("5")) {
                        System.out.println("Введите искомое значение параметра: частота процессора ");
                        inscan = scans.nextLine();
                        if (inscan != "")
                            map.put("frequency", inscan);
                    }

                    if (s.equalsIgnoreCase("6")) {
                        System.out.println("Введите искомое значение параметра: цвет  ");
                        inscan = scans.nextLine();
                        if (inscan != "")
                            map.put("color", inscan);
                    }

                    if (s.equalsIgnoreCase("7")) {
                        System.out.println("Введите искомое значение параметра: стоимость ");
                        inscan = scans.nextLine();
                        if (inscan != "")
                            map.put("price", inscan);
                    }
                    if (s.equalsIgnoreCase("")) {
                        System.out.println("Ничего не выбрано.");
                        // можем предложить по умолчанию или рекламный продукт
   /*                 map.put("maker", "Dell");
                    map.put("OS", "Windows");
                    map.put("RAM", "8");*/
                    }
                }
        scans.close();
        return map;
    }
    public static void searching(ArrayList<Notebook> listObject, HashMap<String,String> request) {
        ArrayList<Notebook> out = new ArrayList<>();
        if(request.isEmpty()){
            System.out.println("Для поиска необходим хотя бы один параметр \n");

        } else {
            var params = request.keySet();
            for (Object param: params){
                for (Notebook nb:listObject){

                    if (nb.parametrsMap().get(param.toString()).toString().equalsIgnoreCase(request.get(param.toString()))){
                        if ( !out.contains(nb)){
                            out.add(nb);
                        }

                    }
                }
            }
            for (Object param: params){
                ArrayList<Notebook> result_out = new ArrayList<>(out);
                for (Notebook nb: result_out){
                    if (!nb.parametrsMap().get(param.toString()).toString().equalsIgnoreCase(request.get(param.toString()))){
                        out.remove(nb);
                    }
                }
            }
            if (out.isEmpty())
            {
                System.out.println("Ничего не найдено");

            } else {
                for (Notebook nb: out){
                    System.out.println("Можем предложить: ");
                    System.out.println(nb);
                }
            }
        }

    }
}