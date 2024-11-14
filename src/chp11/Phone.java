package chp11;

public interface Phone {
    String PRODUCT_NAME = "Apple";
    public abstract void callPhone(String phone);
    void receivePhone(String phoneNumber);
}