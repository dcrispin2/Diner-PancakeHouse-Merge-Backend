package edu.iu.dcrispin.DinerPancakeHouseMerge.model;
import java.util.Iterator;
public class DinerMenuIterator implements Iterator{
    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position + 1 < menuItems.length){return true;}
        else return false;
    }

    @Override
    public MenuItem next() {
        position = position + 1;
        return menuItems[position];
    }

    @Override
    public void remove() {
        if (position <= 0){
            throw new IllegalStateException();
        }
        if (menuItems[position - 1] != null){
            for (int i = position - 1; i < (menuItems.length - 1); i++){
                menuItems[i] = menuItems[i + 1];
            }
        }
    }
}
