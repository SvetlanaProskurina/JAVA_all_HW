package itog;

public class Email extends Contact {
    private String email;

    public Email(String email) {
        this.email = email;
    }

//    public void setEmail(String email) {
//        this.email = email;
//    }

    @Override
    public void test() {

    }

    @Override
    public String toString() {
        return "email=" + email ;
    }
}
