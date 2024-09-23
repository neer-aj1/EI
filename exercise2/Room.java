package exercise2;

public class Room {
    private int roomId;
    private int capacity;
    private boolean isOccupied;
    private boolean isBooked;
    private RoomOccupancySensor occupancySensor;

    public Room(int id) {
        this.roomId = id;
        this.isOccupied = false;
        this.isBooked = false;
        this.occupancySensor = new RoomOccupancySensor(this);
    }

    public int getRoomId() {
        return roomId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setCapacity(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
            System.out.println("Room " + roomId + " maximum capacity set to " + capacity);
        } else {
            System.out.println("Invalid capacity. Please enter a valid positive number.");
        }
    }

    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
        occupancySensor.update(isOccupied);
    }

    public void setBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public int getCapacity() {
        return capacity;
    }
}
