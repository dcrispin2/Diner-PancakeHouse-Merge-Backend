package edu.iu.dcrispin.DinerPancakeHouseMerge.controllers;

import edu.iu.dcrispin.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.dcrispin.DinerPancakeHouseMerge.repository.DinerRepository;
import edu.iu.dcrispin.DinerPancakeHouseMerge.repository.PancakeHouseRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/merger")
public class MergerController {
    DinerRepository dinerRepository;
    PancakeHouseRepository pancakeHouseRepository;

    public MergerController(DinerRepository dinerRepository, PancakeHouseRepository pancakeHouseRepository){
        this.dinerRepository = dinerRepository;
        this.pancakeHouseRepository = pancakeHouseRepository;
    }

    @GetMapping
    public List<MenuItem> get() {
        List<MenuItem> pancakeMenu = pancakeHouseRepository.getTheMenu();
        List<MenuItem> dinerMenu = Arrays.asList(dinerRepository.getTheMenu());
        List<MenuItem> allMenu = List.copyOf(pancakeMenu);
        allMenu.addAll(dinerMenu);
        return allMenu;
    }
}
