package itog;

import java.util.Scanner;

public class ReadAllByNameContragent {

  public static void make(ContragentGroup contragents) {
    Scanner scans = new Scanner(System.in);
    scans.useDelimiter("\n");
    String nameContragent;
    System.out.println("Введите имя/название компании для получения подробностей:");
    nameContragent = scans.next();
//    nameContragent = ScanTerminal.make();
    for (Contragent in : contragents) {
      if (in.getName().contains(nameContragent)) {
        System.out.println(in);
      }
    }
//    scans.close();
  }
}
