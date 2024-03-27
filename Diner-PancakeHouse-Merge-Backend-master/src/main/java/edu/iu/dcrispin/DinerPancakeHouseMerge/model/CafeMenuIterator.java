package edu.iu.dcrispin.DinerPancakeHouseMerge.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenuIterator implements Iterator<MenuItem> {

    private HashMap<String, MenuItem> menuItems;
    private ArrayList<String> keyList = new ArrayList<String>(menuItems.keySet());
    private int index = 0;
    public CafeMenuIterator(HashMap<String, MenuItem> menuItems) {
        this.menuItems = menuItems;
    }


    @Override
    public boolean hasNext() {
        if (index >= keyList.size() || (keyList.get(index) == null)) {
            return false;
        }
        else return true;
    }

    @Override
    public MenuItem next() {
        index = index++;
        return menuItems.get(keyList.get(index));
    }

    @Override
    public void remove() {
        if (index <= 0) {
            throw new IllegalStateException
                    ("You can't remove an item until you've done at least one next()");
        }
        if (keyList.get(index - 1) != null) {
            for (int i = index - 1; i < (keyList.size() - 1); i++) {
                keyList.set(index, keyList.get(index + 1));
            }
            keyList.set(keyList.size() - 1, null);
        }
    }
}
