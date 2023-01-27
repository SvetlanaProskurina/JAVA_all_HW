package itog;


import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DeleteContactFromContragent {
    public static void make(ContragentGroup contragents) {
        String inputStr = "";
        Contact find = new Contact();
        Scanner scans = new Scanner(System.in);
        scans.useDelimiter("\n");
        System.out.println("Введите имя/название компании:");
        inputStr = scans.next();

        for (Contragent in : contragents) {
            if (in.getName().contains(inputStr)) {
                System.out.println(in.toString());
                System.out.println("Введите что нужно удалить:");
                inputStr = scans.next();


                System.out.println("Вы хотите удалить: " + inputStr);

                List<Contact> contactList = in.getListContact();
                Iterator<Contact> it = contactList.iterator();
                while (it.hasNext()) {
                    Contact nextContact = it.next();
                    String finds = nextContact.toString();
                    if (finds.equals(inputStr)) {
                        it.remove();
                        System.out.println("Вы удалили " + inputStr);
                    }
                }
                System.out.println(in);
            }
        }
    }
}
