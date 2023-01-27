package itog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddNewContactToContragent {
    public static void make(ContragentGroup contragents) {
        String inputStr = "";

        Scanner scans = new Scanner(System.in);
        scans.useDelimiter("\n");
        System.out.println("Введите имя/название компании:");
        inputStr = scans.next();

        for (Contragent in : contragents) {
            if (in.getName().contains(inputStr)) {
                addContact(in);
                System.out.println(in);
            }
        }
    }

    private static void addContact(Contragent contragent) {
        Long inputLong;
        String inputStr = "";
        Scanner scans = new Scanner(System.in);
        scans.useDelimiter("\n");
        Integer input;
        do {
            System.out.println("Введите 1 - если хотите добавить email, "
                    + "\n 2 - если хотите добавить номер телефона, "
                    + "\n 3 - если хотите добавить адрес,"
                    + "\n 4 - если хотите добавить ник Telegram,"
                    + "\n 5 - если хотите добавить ссылку на страницу ВКонтакте"
                    + "\n 6 - если хотите выйти из меню:");

            input = scans.nextInt();

            if (input >= 1 && input <= 5) {
                switch (input) {
                    case 1:
                        System.out.println("Введите email:");
                        inputStr = scans.next();
                        contragent.addContact(new Email(inputStr));
                        System.out.println("Вы добавили " + inputStr);
                        break;
                    case 2:
                        System.out.println("Введите номер телефона:");
                        inputLong = scans.nextLong();
                        contragent.addContact(new TelephoneNumber(inputLong));
                        System.out.println("Вы добавили " + inputLong);
                        break;
                    case 3:
                        System.out.println("Введите адрес:");
                        inputStr = scans.next();
                        contragent.addContact(new Address(inputStr));
                        System.out.println("Вы добавили " + inputStr);
                        break;
                    case 4:
                        System.out.println("Введите ник Telegram:");
                        inputStr = scans.next();
                        contragent.addContact(new Telegram(inputStr));
                        System.out.println("Вы добавили " + inputStr);
                        break;
                    case 5:
                        System.out.println("Введите ссылку на страницу ВКонтакте::");
                        inputStr = scans.next();
                        contragent.addContact(new VKUrl(inputStr));
                        System.out.println("Вы добавили " + inputStr);
                        break;
                    default:
                        break;
                }
            }
        } while (input < 6);
//        scans.close();
    }
}
