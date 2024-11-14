package chp11.ex11_1_2_3;

public class G24 implements Phone, Message, Alarm{
    @Override
    public void playMusic(String musicTitle) {
        System.out.println("Playing music " + musicTitle);
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
        System.out.println("Calling phone " + phone);
    }

    @Override
    public void receivePhone(String phoneNumber) {
        System.out.println("Received Phone " + phoneNumber);
    }
}
