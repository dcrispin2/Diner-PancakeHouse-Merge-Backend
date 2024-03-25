package edu.iu.dcrispin.DinerPancakeHouseMerge.model;

import java.util.List;
import java.util.Iterator;

public class PancakeHouseIterator implements Iterator{
    List<MenuItem> menuItems;

    int position = 0;

    public PancakeHouseIterator(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position + 1 < menuItems.size()){return true;}
        else return false;
    }

    @Override
    public Object next() {
        position = position + 1;
        return menuItems.get(position);
    }
}
