package itog;

public class Telegram extends Contact {
    private String telegram;

    public Telegram(String telegram) {
        this.telegram = telegram;
    }

    @Override
    public void test() {

    }

    @Override
    public String toString() {
        return "telegram=" + telegram ;
    }
}
