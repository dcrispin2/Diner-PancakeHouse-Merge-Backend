package edu.iu.dcrispin.DinerPancakeHouseMerge.controllers;

import edu.iu.dcrispin.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.dcrispin.DinerPancakeHouseMerge.repository.DinerRepository;
import edu.iu.dcrispin.DinerPancakeHouseMerge.repository.PancakeHouseRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/pancakehouse")
public class PancakeHouseController {
    PancakeHouseRepository repository;

    public PancakeHouseController(PancakeHouseRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<MenuItem> get() {
        return repository.getTheMenu();
    }
}
