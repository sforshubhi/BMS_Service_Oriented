package org.bitsp.reportsservice.controller;

import org.bitsp.reportsservice.model.Room;
import org.bitsp.reportsservice.repository.ReportsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportsController {
    private static final Logger LOGGER
            = LoggerFactory.getLogger(ReportsController.class);

    @Autowired
    ReportsRepository repository;

    @PostMapping
    public Room add(@RequestBody Room Room) {
        LOGGER.info("Room add: {}", Room);
        return repository.add(Room);
    }

    @GetMapping
    public List<Room> findAll() {
        LOGGER.info("Room find");
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Room findById(@PathVariable("id") Long id) {
        LOGGER.info("Room find: id={}", id);
        return repository.findById(id);
    }


}
