package exercise1.behavioural.customerSupport;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SupportLevel frontDesk = new FrontDeskSupport();
        SupportLevel supervisor = new SupervisorSupport();
        SupportLevel manager = new ManagerSupport();

        frontDesk.setNextLevel(supervisor);
        supervisor.setNextLevel(manager);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Support Issue Handler ---");
            System.out.print("Enter issue difficulty (easy, medium, hard) or 'exit' to quit: ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Exiting...");
                break;
            }

            Issue issue = new Issue(input);
            frontDesk.handleIssue(issue);
        }

        scanner.close();
    }
}
