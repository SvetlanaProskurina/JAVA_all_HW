package itog;

import java.util.ArrayList;
import java.util.List;

public abstract class Contragent implements Comparable<Contact> {
    private String name;
    private List<Contact> listContact = new ArrayList<>();

//    public static HashMap<String, List<Contact>> contragent = new HashMap<>();

    public String getName() {
        return name;
    }

    public List<Contact> getListContact() {
        return listContact;
    }

    public Contragent(String name){//, List<Contact> listContact) {
        this.name = name;
        this.listContact = listContact;
    }
    public void addContact(Contact contact){
        this.listContact.add(contact);
    }

    @Override
    public String toString() {
        return "Contragent{" +
                "name='" + name + '\'' +
                ", listContact=" + listContact+
                '}';
    }
    public int compareTo(Contragent o) {
        return 0;
    }


}
