package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class MergerRepository {


    public List<MenuItemRecord> getTheMenuItems() {
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(new DinerMenu("DINER MENU", "Lunch"));
        allMenus.add(new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast"));
        allMenus.add(new CafeMenu("CAFE MENU", "Dinner"));
        MenuItem[] menuItems = allMenus.getItems();
        List<MenuItemRecord> records = Arrays.stream(menuItems).map(x -> new MenuItemRecord(x.getName(), x.getDescription(), x.isVegetarian(), x.getPrice())).toList();
        return records;
    }

    public List<MenuItemRecord> getTheVegetarianMenuItems() {
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(new DinerMenu("DINER MENU", "Lunch"));
        allMenus.add(new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast"));
        allMenus.add(new CafeMenu("CAFE MENU", "Dinner"));
        CompositeIterator compositeIterator = new CompositeIterator(allMenus.createIterator());
        List<MenuItemRecord> records = new ArrayList<>();
        for (CompositeIterator it = compositeIterator; it.hasNext(); ) {
            MenuComponent menuComponent = it.next();
            try {
                MenuItem menuItem = (MenuItem) menuComponent;
                if (menuItem.isVegetarian()) {
                    records.add(new MenuItemRecord(menuItem.getName(), menuItem.getDescription(), menuItem.isVegetarian(), menuItem.getPrice()));
                }
            } catch (ClassCastException e) {
            }
        }
        return records;
    }

    public List<MenuItemRecord> getTheBreakfastMenuItems() {
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
//        allMenus.add(new DinerMenu("DINER MENU", "Lunch"));
        allMenus.add(new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast"));
//        allMenus.add(new CafeMenu("CAFE MENU", "Dinner"));

        CompositeIterator compositeIterator = new CompositeIterator(allMenus.createIterator());
        List<MenuItemRecord> records = new ArrayList<>();
        for (CompositeIterator it = compositeIterator; it.hasNext(); ) {
            MenuComponent menuComponent = it.next();
            try {
                MenuItem menuItem = (MenuItem) menuComponent;
//                if (menuItem.isVegetarian()) {
                records.add(new MenuItemRecord(menuItem.getName(), menuItem.getDescription(), menuItem.isVegetarian(), menuItem.getPrice()));
//                }
            } catch (ClassCastException e) {
            }
        }
        return records;
    }

    public List<MenuItemRecord> getTheLunchMenuItems() {
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(new DinerMenu("DINER MENU", "Lunch"));
//        allMenus.add(new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast"));
//        allMenus.add(new CafeMenu("CAFE MENU", "Dinner"));

        CompositeIterator compositeIterator = new CompositeIterator(allMenus.createIterator());
        List<MenuItemRecord> records = new ArrayList<>();
        for (CompositeIterator it = compositeIterator; it.hasNext(); ) {
            MenuComponent menuComponent = it.next();
            try {
                MenuItem menuItem = (MenuItem) menuComponent;
//                if (menuItem.isVegetarian()) {
                records.add(new MenuItemRecord(menuItem.getName(), menuItem.getDescription(), menuItem.isVegetarian(), menuItem.getPrice()));
//                }
            } catch (ClassCastException e) {
            }
        }
        return records;
    }

    public List<MenuItemRecord> getTheDinnerMenuItems() {
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
//        allMenus.add(new DinerMenu("DINER MENU", "Lunch"));
//        allMenus.add(new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast"));
        allMenus.add(new CafeMenu("CAFE MENU", "Dinner"));

        CompositeIterator compositeIterator = new CompositeIterator(allMenus.createIterator());
        List<MenuItemRecord> records = new ArrayList<>();
        for (CompositeIterator it = compositeIterator; it.hasNext(); ) {
            MenuComponent menuComponent = it.next();
            try {
                MenuItem menuItem = (MenuItem) menuComponent;
//                if (menuItem.isVegetarian()) {
                records.add(new MenuItemRecord(menuItem.getName(), menuItem.getDescription(), menuItem.isVegetarian(), menuItem.getPrice()));
//                }
            } catch (ClassCastException e) {
            }
        }
        return records;
    }


}