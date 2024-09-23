package exercise2;

public class RoomOccupancySensor implements RoomObserver{
    private Room room;

    public RoomOccupancySensor(Room room) {
        this.room = room;
    }

    @Override
    public void update(boolean isOccupied) {
        if (isOccupied) {
            System.out.println("Room " + room.getRoomId() + " is now occupied. AC and lights turned on.");
        } else {
            System.out.println("Room " + room.getRoomId() + " is now unoccupied. AC and lights turned off.");
        }
    }

}
