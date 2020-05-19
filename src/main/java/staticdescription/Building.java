package staticdescription;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Room> rooms;

    public Building() {
        System.out.println("Building created");
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }


    static class Room {
        private String roomName;

        public Room(String roomName) {
            this.roomName = roomName;
            System.out.println(String.format("Room created %s", this,roomName));
        }
    }
}
