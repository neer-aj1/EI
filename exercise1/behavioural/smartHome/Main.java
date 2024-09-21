package exercise1.behavioural.smartHome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartHomeMediator mediator = new SmartHomeHub();
        Lights lights = new Lights("Lights");
        Thermostat thermostat = new Thermostat("Thermostat");
        SecuritySystem securitySystem = new SecuritySystem("SecuritySystem");
        AC ac = new AC("AC");

        mediator.registerDevice("Lights", lights);
        mediator.registerDevice("Thermostat", thermostat);
        mediator.registerDevice("SecuritySystem", securitySystem);
        mediator.registerDevice("AC", ac);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Smart Home Menu ---");
            System.out.println("1. Arm Security System");
            System.out.println("2. Set Thermostat Temperature");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    securitySystem.arm();
                    break;
                case 2:
                    System.out.print("Enter new temperature: ");
                    int temp = scanner.nextInt();
                    thermostat.setTemperature(temp);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
