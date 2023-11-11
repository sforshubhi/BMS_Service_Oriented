package org.bitsp.reservationservice.controller;

import org.bitsp.reservationservice.model.Building;
import org.bitsp.reservationservice.repository.ReservationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    private static final Logger LOGGER
            = LoggerFactory.getLogger(ReservationController.class);

    @Autowired
    ReservationRepository repository;

    @PostMapping
    public Building add(@RequestBody Building Building) {
        LOGGER.info("Building add: {}", Building);
        return repository.add(Building);
    }
    
    @PostMapping("/seats/book")
    public Building seatBooking(@RequestBody Building Building) {
        LOGGER.info("Building add: {}", Building);
        return repository.add(Building);
    }

    @GetMapping("/seats")
    public List<Building> findAll() {
        LOGGER.info("Building find");
        return repository.findAll();
    }

    @GetMapping("/seats/{id}")
    public Building findById(@PathVariable("id") int id) {
        LOGGER.info("Building find: id={}", id);
        return repository.findById(id);
    }


}
