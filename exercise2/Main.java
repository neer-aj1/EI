package exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OfficeManager officeManager = OfficeManager.getInstance();

        while (true) {
            System.out.println("1. Configure Rooms");
            System.out.println("2. Set Room Capacity");
            System.out.println("3. Book Room");
            System.out.println("4. Cancel Booking");
            System.out.println("5. Add Occupant to Room");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter number of rooms: ");
                    int roomCount = scanner.nextInt();
                    officeManager.configureRooms(roomCount);
                    break;
                case 2:
                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();
                    Room room = officeManager.getRoom(roomNumber);
                    if (room != null) {
                        System.out.print("Enter maximum capacity: ");
                        int capacity = scanner.nextInt();
                        room.setCapacity(capacity);
                    }
                    break;
                case 3:
                    System.out.print("Enter room number: ");
                    roomNumber = scanner.nextInt();
                    room = officeManager.getRoom(roomNumber);
                    if (room != null) {
                        System.out.print("Enter start time (e.g., 09:00): ");
                        String startTime = scanner.next();
                        System.out.print("Enter duration in minutes: ");
                        int duration = scanner.nextInt();
                        Command bookCommand = new BookRoomCommand(room, startTime, duration);
                        bookCommand.execute();
                    }
                    break;
                case 4:
                    System.out.print("Enter room number: ");
                    roomNumber = scanner.nextInt();
                    room = officeManager.getRoom(roomNumber);
                    if (room != null) {
                        Command cancelCommand = new CancelRoomCommand(room);
                        cancelCommand.execute();
                    }
                    break;
                case 5:
                    System.out.print("Enter room number: ");
                    roomNumber = scanner.nextInt();
                    room = officeManager.getRoom(roomNumber);
                    if (room != null) {
                        System.out.print("Enter number of occupants: ");
                        int occupants = scanner.nextInt();
                        Command statusCommand = new UpdateRoomStatusCommand(room, occupants);
                        statusCommand.execute();
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
