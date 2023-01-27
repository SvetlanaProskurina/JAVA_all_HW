package itog;

public class VKUrl extends Contact {
    private String VKUrl;

    public VKUrl(String VKUrl) {
        this.VKUrl = VKUrl;
    }

    @Override
    public void test() {
    }

    @Override
    public String toString() {
        return "PageVK=" + VKUrl ;
    }
}
