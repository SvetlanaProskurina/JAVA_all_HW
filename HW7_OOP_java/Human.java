package itog;


public class Human extends Contragent{
    public Human(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + Human.super.getName() + '\'' +
                ", listContact=" + Human.super.getListContact()+
                '}';
    }


    @Override
    public int compareTo(Contact o) {
        return 0;
    }

}
