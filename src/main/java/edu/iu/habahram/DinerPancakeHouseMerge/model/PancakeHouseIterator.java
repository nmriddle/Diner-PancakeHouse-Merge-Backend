package edu.iu.habahram.DinerPancakeHouseMerge.model;

import java.util.List;

public class PancakeHouseIterator implements Iterator {

    List<MenuItem> menuItems;
    int position = -1;


    public PancakeHouseIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size() - 1;
    }

    @Override
    public MenuItem next() {
        position++;
        return menuItems.get(position);
    }

    @Override
    public void remove() {

    }
}
