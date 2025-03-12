package com.azvtech.bus_stop_api.controller;

import com.azvtech.bus_stop_api.model.Stop;
import com.azvtech.bus_stop_api.repository.StopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Fellipe Toledo
 */

@RestController
@RequestMapping("/api/stops")
public class BusStopController {

    private final StopRepository stopRepository;

    public BusStopController(StopRepository stopRepository) {
        this.stopRepository = stopRepository;
    }

    @GetMapping
    public List<Stop> getAllStops() {
        return stopRepository.findAll();
    }

}
