package exercise2;

class UpdateRoomStatusCommand implements Command{
    private Room room;
    private int occupants;

    public UpdateRoomStatusCommand(Room room, int occupants) {
        this.room = room;
        this.occupants = occupants;
    }

    @Override
    public void execute() {
        if (occupants >= 2) {
            room.setOccupied(true);
            System.out.println("Room " + room.getRoomId() + " is now occupied by " + occupants + " persons.");
        } else if (occupants == 0) {
            room.setOccupied(false);
            System.out.println("Room " + room.getRoomId() + " is now unoccupied.");
        } else {
            System.out.println("Room " + room.getRoomId() + " occupancy insufficient to mark as occupied.");
        }
    }
}
