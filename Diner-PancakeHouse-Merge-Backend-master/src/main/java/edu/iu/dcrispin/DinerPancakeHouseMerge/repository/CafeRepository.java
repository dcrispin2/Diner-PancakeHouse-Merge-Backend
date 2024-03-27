package edu.iu.dcrispin.DinerPancakeHouseMerge.repository;

import edu.iu.dcrispin.DinerPancakeHouseMerge.model.CafeMenu;
import edu.iu.dcrispin.DinerPancakeHouseMerge.model.Menu;
import edu.iu.dcrispin.DinerPancakeHouseMerge.model.MenuItem;

import java.util.HashMap;
import java.util.Iterator;

public class CafeRepository {
    public HashMap<String, MenuItem> getTheMenu() {
        CafeMenu cafeMenu = new CafeMenu();
        return cafeMenu.getMenuItems();
    }

    public Iterator<MenuItem> getTheMenuIterator() {
        Menu cafeMenu = new CafeMenu();
        return cafeMenu.createIterator();
    }
}
