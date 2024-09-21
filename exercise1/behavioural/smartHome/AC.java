package exercise1.behavioural.smartHome;

public class AC extends Device{
    public AC(String name) {
        super(name);
    }
    public void turnOn() {
        System.out.println("AC turned on");
    }
}
