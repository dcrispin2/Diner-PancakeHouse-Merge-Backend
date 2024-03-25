package edu.iu.dcrispin.DinerPancakeHouseMerge.controllers;

import edu.iu.dcrispin.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.dcrispin.DinerPancakeHouseMerge.repository.DinerRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/diner")
public class DinerController {

    DinerRepository repository;

    public DinerController(DinerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public MenuItem[] get() {
        return repository.getTheMenu();
    }
}
