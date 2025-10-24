package homeautomation;
import java.util.*;

public class Home {
    private List<Room> rooms = new ArrayList<>();

    public void addRoom(Room r) { rooms.add(r); }
    public List<Room> getRooms() { return rooms; }

    public Room findRoom(String name) {
        for (Room r : rooms) {
            if (r.getName().equalsIgnoreCase(name)) return r;
        }
        return null;
    }
}