package homeautomation;
import java.util.*;

public class HomeAutomationApp {
    private static Scanner sc = new Scanner(System.in);
    private static Home home = new Home();

    public static void main(String[] args) {
        System.out.println("=== Home Automation Console ===");
        while (true) {
            System.out.println("\n1. Add Room\n2. Add Device to Room\n3. Toggle Device\n4. Show Status\n5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1 -> addRoom();
                case 2 -> addDevice();
                case 3 -> toggleDevice();
                case 4 -> showStatus();
                case 5 -> { System.out.println("Exiting..."); return; }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private static void addRoom() {
        System.out.print("Enter room name: ");
        String name = sc.nextLine();
        home.addRoom(new Room(name));
        System.out.println("Room added.");
    }

    private static void addDevice() {
        System.out.print("Enter room name: ");
        String roomName = sc.nextLine();
        Room room = home.findRoom(roomName);
        if (room == null) { System.out.println("Room not found."); return; }

        System.out.println("Device types: Light, AirConditioner, Television");
        System.out.print("Enter device type: ");
        String type = sc.nextLine();
        System.out.print("Enter device name: ");
        String devName = sc.nextLine();

        Device device = switch (type.toLowerCase()) {
            case "light" -> new Light(devName);
            case "airconditioner" -> new AirConditioner(devName);
            case "television" -> new Television(devName);
            default -> null;
        };

        if (device != null) {
            room.addDevice(device);
            System.out.println("Device added.");
        } else System.out.println("Unknown device type.");
    }

    private static void toggleDevice() {
        System.out.print("Enter room name: ");
        String roomName = sc.nextLine();
        Room room = home.findRoom(roomName);
        if (room == null) { System.out.println("Room not found."); return; }

        System.out.print("Enter device name: ");
        String devName = sc.nextLine();

        for (Device d : room.getDevices()) {
            if (d.getName().equalsIgnoreCase(devName)) {
                d.toggle();
                System.out.println("Toggled " + d.getName() + " -> " + d.getState());
                return;
            }
        }
        System.out.println("Device not found.");
    }

    private static void showStatus() {
        for (Room r : home.getRooms()) r.showStatus();
    }
}