/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.*/
import java.util.HashMap;
import java.util.Scanner;

public class task11 {
    public static HashMap<String, HashMap<String, String>> phonebook = new HashMap<>();

    public static void main(String[] args){


        Scanner scans = new Scanner(System.in);
        addPhones(scans);
        getPhonebook();
        scans.close();
        System.out.println();


    }
    public static void addPhones(Scanner scans) {


        String FIO, phoneNumber, phoneType;
        String answer;
        Boolean flag;
        HashMap<String, String> phoneNumbers = new HashMap<>();


        System.out.printf("Введите Фамилию Имя Отчество: \n");
        FIO = scans.nextLine();

        System.out.printf("Введите номер телефона: \n");
        phoneNumber = scans.nextLine();

        System.out.printf("Введите комментарий (мобильный, рабочий, домашний и т.д.: \n");
        phoneType = scans.nextLine();

        phoneNumbers.put(phoneNumber, phoneType);

        System.out.printf("Добавить еще один номер? Введите 'Да', если добавить и 'Нет', если нет. \n");
        answer = scans.nextLine().toString();

        if (answer.equals("Да")) {
            System.out.printf("Введите номер телефона: \n");
            phoneNumber = scans.nextLine();

            System.out.printf("Введите комментарий (мобильный, рабочий, домашний и т.д.: \n");
            phoneType = scans.nextLine();

            phoneNumbers.put(phoneNumber, phoneType);

        } else if (answer.equals("Нет")) {
            phoneNumbers.put(phoneNumber, phoneType);
        }
        else {
            System.out.printf("Вы ввели %s .\n", answer);
        }

        phonebook.put(FIO, phoneNumbers);
    }

    public static void getPhonebook (){
        for (HashMap.Entry<String, HashMap<String,String>> entry : phonebook.entrySet()) {
            HashMap<String,String> nums = new HashMap<>();

            System.out.println();
            System.out.println(entry.getKey());

            nums = entry.getValue();

            for (HashMap.Entry<String,String> insideEntry : nums.entrySet()){
                System.out.println(insideEntry.getKey() + "-" + insideEntry.getValue());
            }
        }
    }

}

