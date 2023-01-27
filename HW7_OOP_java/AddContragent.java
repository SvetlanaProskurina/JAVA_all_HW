package itog;

import java.util.Scanner;

public class AddContragent {

  public static void make(ContragentGroup contragents) {
    Human human;
    Company company;
    String nameContragent = "";
    Integer input;
    Long inputLong;
    String inputStr = "";
    Scanner scans = new Scanner(System.in);
    scans.useDelimiter("\n");
    System.out.println("Введите 1 - если хотите добавить физическое лицо, "
        + "2 - если юридическое:");
    input = Integer.parseInt(scans.next());
    if (input == 1) {

      System.out.println("Введите имя физического лица:");
      inputStr = scans.next();

      if (!inputStr.isEmpty()) {
        human = new Human(inputStr);

        do {
          System.out.println("Введите 1 - если хотите добавить email, "
              + "2 - если хотите добавить номер телефона, "
              + "3 - если хотите добавить адрес,"
              + "4 - если хотите добавить ник Telegram,"
              + "5 - если хотите добавить ссылку на страницу ВКонтакте"
              + "6 - если хотите выйти из меню:");

          input = scans.nextInt();

          if (input >= 1 && input <= 5) {
            switch (input) {
              case 1:
                System.out.println("Введите email:");
                inputStr = scans.next();
                human.addContact(new Email(inputStr));
                break;
              case 2:
                System.out.println("Введите номер телефона:");
                inputLong = scans.nextLong();
                human.addContact(new TelephoneNumber(inputLong));
                break;
              case 3:
                System.out.println("Введите адрес:");
                inputStr = scans.next();
                human.addContact(new Address(inputStr));
                break;
              case 4:
                System.out.println("Введите ник Telegram:");
                inputStr = scans.next();
                human.addContact(new Telegram(inputStr));
                break;
              case 5:
                System.out.println("Введите ссылку на страницу ВКонтакте::");
                inputStr = scans.next();
                human.addContact(new VKUrl(inputStr));
                break;
              default:
                break;
            }

          }
        } while (input < 6);
        System.out.println("Вы добавили " + human);
        contragents.add(human);
      }
    }else {
        System.out.println("Введите название компании:");
        inputStr = scans.next();

        if (!inputStr.isEmpty()) {
          company = new Company(inputStr);
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
                  company.addContact(new Email(inputStr));
                  break;
                case 2:
                  System.out.println("Введите номер телефона:");
                  inputLong = scans.nextLong();
                  company.addContact(new TelephoneNumber(inputLong));
                  break;
                case 3:
                  System.out.println("Введите адрес:");
                  inputStr = scans.next();
                  company.addContact(new Address(inputStr));
                  break;
                case 4:
                  System.out.println("Введите ник Telegram:");
                  inputStr = scans.next();
                  company.addContact(new Telegram(inputStr));
                  break;
                case 5:
                  System.out.println("Введите ссылку на страницу ВКонтакте::");
                  inputStr = scans.next();
                  company.addContact(new VKUrl(inputStr));
                  break;
                default:
                  break;
              }

            }
          } while (input < 6);
          System.out.println("Вы добавили " + company);
          contragents.add(company);
        }

      }
//    scans.close();
    }

  }
