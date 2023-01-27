package itog;

public class Address extends Contact {
    private String address;

    public Address(String address) {
        this.address = address;
    }

    @Override
    public void test() {
    }

    @Override
    public String toString() {
        return "address=" + address ;
    }
}
