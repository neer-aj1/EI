package exercise2;

class BookRoomCommand implements Command{
    private Room room;
    private String startTime;
    private int duration;

    public BookRoomCommand(Room room, String startTime, int duration) {
        this.room = room;
        this.startTime = startTime;
        this.duration = duration;
    }

    @Override
    public void execute() {
        if (!room.isBooked()) {
            room.setBooked(true);
            System.out.println("Room " + room.getRoomId() + " booked from " + startTime + " for " + duration + " minutes.");
        } else {
            System.out.println("Room " + room.getRoomId() + " is already booked during this time. Cannot book.");
        }
    }
}
