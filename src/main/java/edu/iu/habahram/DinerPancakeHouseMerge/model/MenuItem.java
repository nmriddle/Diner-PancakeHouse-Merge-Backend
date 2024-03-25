package edu.iu.habahram.DinerPancakeHouseMerge.model;

public class MenuItem implements Comparable<MenuItem> {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String toString() {
        return (name + ", $" + price + "\n   " + description);
    }

    @Override
    public int compareTo(MenuItem other) {
        if (other.getName().compareTo(this.getName()) < 0) {
            return -1;
        }
        if (other.getName().compareTo(this.getName()) > 0) {
            return 1;
        }
        return 0;
    }
}
