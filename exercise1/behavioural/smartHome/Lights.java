package exercise1.behavioural.smartHome;

public class Lights extends Device{
    public Lights(String name){
        super(name);
    }
    public void turnOff(){
        System.out.println("Lights are off");
        mediator.deviceChanged(name);
    }
}
