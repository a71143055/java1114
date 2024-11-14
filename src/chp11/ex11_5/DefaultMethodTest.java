package chp11.ex11_5;

public class DefaultMethodTest {
    public static void main(String[] args) {
        Vehicle b = new Bicycle();
        Vehicle t = new Train();
        b.horn();
        t.horn();
        b.move("명동", "신촌");
        t.move("서울", "부산");
    }
}

interface Vehicle {
    void horn();
    default public void move(String from, String to) {
        System.out.println("From "+ from + " move to " + to);
    }
}

class Bicycle implements Vehicle {
    public void horn() {
        System.out.println("Bicycle horned");
    }
}

class Train implements Vehicle {
    public void horn() {
        System.out.println("Train horned");
    }

    public void move(String from, String to) {
        System.out.println("From "+ from + " move to " + to + " through train.");
    }
}