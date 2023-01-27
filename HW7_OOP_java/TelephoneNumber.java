package itog;

public class TelephoneNumber extends Contact {
    private long telephoneNumber;

    public TelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    @Override
    public void test() {
    }

    @Override
    public String toString() {
        return "telephoneNumber=" + telephoneNumber ;
    }
}
