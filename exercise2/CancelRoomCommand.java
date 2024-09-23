package exercise2;

class CancelRoomCommand implements Command{
    private Room room;

    public CancelRoomCommand(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        if (room.isBooked()) {
            room.setBooked(false);
            System.out.println("Booking for Room " + room.getRoomId() + " cancelled successfully.");
        } else {
            System.out.println("Room " + room.getRoomId() + " is not booked. Cannot cancel booking.");
        }
    }
}
