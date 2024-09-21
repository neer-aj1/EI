package exercise1.behavioural.smartHome;

public class SecuritySystem extends Device{
    private boolean isArmed;

    public SecuritySystem(String name) {
        super(name);
    }

    public boolean isArmed() {
        return isArmed;
    }

    public void arm() {
        isArmed = true;
        System.out.println("Security system armed");
        mediator.deviceChanged(name);
    }
}
