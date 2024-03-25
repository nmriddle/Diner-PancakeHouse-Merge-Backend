package edu.iu.habahram.DinerPancakeHouseMerge.model;

public class DinerMenuIterator implements Iterator {

    MenuItem[] menuItems;
    int position = -1;


    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length - 1;
    }

    @Override
    public MenuItem next() {
        position++;
        return menuItems[position];
    }


}
