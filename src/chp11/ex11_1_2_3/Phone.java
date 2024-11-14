package chp11.ex11_1_2_3;

public interface Phone {
    String PRODUCT_NAME = "Apple";
    public abstract void callPhone(String phone);
    void receivePhone(String phoneNumber);
}