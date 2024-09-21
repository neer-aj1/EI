package exercise1.behavioural.smartHome;

public interface SmartHomeMediator {
    void registerDevice(String name, Device device);
    void deviceChanged(String name);
}
