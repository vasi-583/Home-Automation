package homeautomation;
import java.util.*;

public class Room {
    private String name;
    private List<Device> devices;

    public Room(String name) {
        this.name = name;
        this.devices = new ArrayList<>();
    }

    public String getName() { return name; }
    public void addDevice(Device d) { devices.add(d); }
    public List<Device> getDevices() { return devices; }

    public void showStatus() {
        System.out.println("\nRoom: " + name);
        for (Device d : devices) {
            System.out.println(" - " + d);
        }
    }
}