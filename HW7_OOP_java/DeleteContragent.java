package itog;

import java.util.Scanner;

public class DeleteContragent {
    public static void make(ContragentGroup contragents) {
        String inputStr = "";

        Scanner scans = new Scanner(System.in);
        scans.useDelimiter("\n");
        System.out.println("Введите имя/название компании:");
        inputStr = scans.next();
        for (Contragent in : contragents) {
            if (in.getName().contains(inputStr)) {
                contragents.getListContragent().remove(in);
                System.out.println("Вы удалили " + in);
            }
        }
    }
}
