package chp11.ex11_1_2_3;

public class IPhone implements Phone, Alarm, Message{

    @Override
    public void playMusic(String musicTitle) {
        System.out.println("Playing " + PRODUCT_NAME + " music " + musicTitle);
    }

    @Override
    public void beep() {
        System.out.println("beep");
    }

    @Override
    public void sendMessage(String content) {
        System.out.println("Sending " + content);
    }

    @Override
    public void receiveMessage(String content) {
        System.out.println("Received " + content);
    }

    @Override
    public void callPhone(String phone) {
        System.out.println("Calling " + phone);
    }

    @Override
    public void receivePhone(String phoneNumber) {
        System.out.println("Received " + phoneNumber);
    }

    public void sendAirdrop(String content) {
        System.out.println("Sending Air drop" + content);
    }
}
