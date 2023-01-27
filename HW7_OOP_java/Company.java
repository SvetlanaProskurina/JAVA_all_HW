package itog;


public class Company extends Contragent{
    public Company(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Company{" +
                "name='" + Company.this.getName() + '\'' +
                ", listContact=" + Company.this.getListContact() +
                '}';
    }

    @Override
    public int compareTo(Contact o) {
        return 0;
    }

}
