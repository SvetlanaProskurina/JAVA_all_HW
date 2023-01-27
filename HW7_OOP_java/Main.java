package itog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Ivan Petrov");//, contactList);
        human1.addContact(new Email("am@ya.ru"));
        human1.addContact(new TelephoneNumber(123456789));
        human1.addContact(new Address("Moscow Derbenevskaya23"));
        human1.addContact(new Address("Moscow Frunzenskaya 3"));
        human1.addContact(new Telegram("@nicks"));
        human1.addContact(new Email("nb@ya.ru"));

        Human human2 = new Human("Ilya Metrov");//, contactList);
        human2.addContact(new Email("uim@ya.ru"));
        human2.addContact(new TelephoneNumber(453456789));
        human2.addContact(new Address("Moscow Trebenevskaya 23"));
        human2.addContact(new Telegram("@opcks"));


        List<Contragent> listContragents = new ArrayList<>();
        listContragents.add(human1);
        listContragents.add(human2);
        ContragentGroup cAG = new ContragentGroup(listContragents);


       Integer input=0;
        Scanner scans = new Scanner(System.in);
//        scans.useDelimiter("\n");
        do {
            System.out.println("Введите 1 - прочитать список контрагентов без подробностей, "
                    + "\n 2 - прочитать данные по конкретному контрагенту"
                    + "\n 3 - добавить контрагента"
                    + "\n 4 - Удалить контрагента"
                    + "\n 5 - Добавить новый способ связаться с контрагентом"
                    + "\n 6 - Удалить способ связаться с контрагентом"
                    + "\n 7 - выйти из меню:");
            input = scans.nextInt();

            switch (input) {
                case 1:
                    ReadListContragents.make(cAG);
                    break;
                case 2:
                    ReadAllByNameContragent.make(cAG);
                    break;
                case 3:
                    AddContragent.make(cAG);
                    break;
                case 4:
                    DeleteContragent.make(cAG);
                    break;
                case 5:
                    AddNewContactToContragent.make(cAG);
                    break;
                case 6:
                    DeleteContactFromContragent.make(cAG);
                    break;
            }

        }while (input < 7) ;
    }
}

//        ReadAllByNameContragent.make(cAG);// прочитать данные по конкретному контрагенту
//        AddContragent.make(cAG);// добавить контрагента
//
//        DeleteContragent.make(cAG);
//        AddNewContactToContragent.make(cAG);
//        ReadAllByNameContragent.make(cAG);
//        DeleteContactFromContragent.make(cAG);
//        ReadListContragents.make(cAG);// прочитать список без подробностей

//        Iterator iter = human1.getListContact().iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }
//        System.out.println(human1);
//        Iterator<Contragent> it = test.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//    }
//}