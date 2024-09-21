package exercise1.behavioural.smartHome;

public abstract class Device {
    protected SmartHomeMediator mediator;
    protected String name;
    public Device(String name){
        this.name = name;
    }
    public void setMediator(SmartHomeMediator mediator){
        this.mediator = mediator;
    }
}
