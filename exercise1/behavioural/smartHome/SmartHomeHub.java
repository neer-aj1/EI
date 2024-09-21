package exercise1.behavioural.smartHome;

import java.util.HashMap;
import java.util.Map;

public class SmartHomeHub implements SmartHomeMediator{
    private Map<String, Device> devices = new HashMap<>();

    @Override
    public void deviceChanged(String name) {
        if (name.equals("SecuritySystem") && ((SecuritySystem) devices.get("SecuritySystem")).isArmed()) {
            System.out.println("Arming the house, turning off the lights.");
            ((Lights) devices.get("Lights")).turnOff();
        }

        if (name.equals("Thermostat") && ((Thermostat) devices.get("Thermostat")).getTemperature() > 30) {
            System.out.println("Temperature too high, turning on the AC.");
            ((AC) devices.get("AC")).turnOn();
        }
    }

    @Override
    public void registerDevice(String name, Device device) {
        devices.put(name, device);
        device.setMediator(this);
    }
}
