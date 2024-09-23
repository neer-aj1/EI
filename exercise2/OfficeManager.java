package exercise2;

import java.util.ArrayList;
import java.util.List;

public class OfficeManager {
    private static OfficeManager instance;
    private List<Room> rooms;

    private OfficeManager() {
        rooms = new ArrayList<>();
    }

    public static synchronized OfficeManager getInstance() {
        if (instance == null) {
            instance = new OfficeManager();
        }
        return instance;
    }

    public void configureRooms(int count) {
        for (int i = 1; i <= count; i++) {
            rooms.add(new Room(i));
        }
        System.out.println("Office configured with " + count + " meeting rooms.");
    }

    public Room getRoom(int roomId) {
        if (roomId <= 0 || roomId > rooms.size()) {
            System.out.println("Room " + roomId + " does not exist.");
            return null;
        }
        return rooms.get(roomId - 1);
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
