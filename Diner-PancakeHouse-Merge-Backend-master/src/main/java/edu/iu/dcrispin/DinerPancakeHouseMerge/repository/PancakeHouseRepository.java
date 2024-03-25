package edu.iu.dcrispin.DinerPancakeHouseMerge.repository;

import edu.iu.dcrispin.DinerPancakeHouseMerge.model.DinerMenu;
import edu.iu.dcrispin.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.dcrispin.DinerPancakeHouseMerge.model.PancakeHouseMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PancakeHouseRepository {
    public List<MenuItem> getTheMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        return pancakeHouseMenu.getMenuItems();
    }
}
