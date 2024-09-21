package exercise1.behavioural.smartHome;

public class Thermostat extends Device{
    private int temperature;

    public Thermostat(String name) {
        super(name);
        this.temperature = 20;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Thermostat set to " + temperature + "°C");
        mediator.deviceChanged(name);
    }
}
