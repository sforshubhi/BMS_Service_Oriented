package org.bitsp.reservationservice.repository;

import org.bitsp.reservationservice.model.Building;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ReservationRepository {

    private List<Building> Buildings
            = new ArrayList<>();

    public Building add(Building Building) {
        Buildings.add(Building);
        return Building;
    }

    public Building findById(int id) {
        return Buildings.stream()
                .filter(a -> a.id()==id)
                .findFirst()
                .orElseThrow();
    }

    public List<Building> findAll() {
        return Buildings;
    }


}
