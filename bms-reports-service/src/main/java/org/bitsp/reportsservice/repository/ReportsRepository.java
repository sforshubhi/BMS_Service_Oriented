package org.bitsp.reportsservice.repository;

import org.bitsp.reportsservice.model.Room;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ReportsRepository {

    private List<Room> Rooms
            = new ArrayList<>();

    public Room add(Room Room) {
        Rooms.add(Room);
        return Room;
    }

    public Room findById(Long id) {
        return Rooms.stream()
                .filter(a -> a.id()==id)
                .findFirst()
                .orElseThrow();
    }

    public List<Room> findAll() {
        return Rooms;
    }

}
