package edu.iu.dcrispin.DinerPancakeHouseMerge.repository;

import edu.iu.dcrispin.DinerPancakeHouseMerge.model.DinerMenu;
import edu.iu.dcrispin.DinerPancakeHouseMerge.model.MenuItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DinerRepository {

    public MenuItem[] getTheMenu() {
        DinerMenu dinerMenu = new DinerMenu();
        return dinerMenu.getMenuItems();
    }
}
