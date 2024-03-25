package edu.iu.habahram.DinerPancakeHouseMerge.model;

public class DinerMenuIterator implements Iterator<MenuItem> {

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

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("you cant remove until youve done at least one next");
        }
        if (menuItems[position - 1] != null) {
            for (int i = position - 1; i < (menuItems.length - 1); i++) {
                menuItems[i] = menuItems[i + 1];
            }
            menuItems[menuItems.length - 1] = null;
        }
    }


}
