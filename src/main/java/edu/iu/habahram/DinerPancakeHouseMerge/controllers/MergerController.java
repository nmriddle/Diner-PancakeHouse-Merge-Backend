package edu.iu.habahram.DinerPancakeHouseMerge.controllers;

import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItemRecord;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.MergerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/merger")
public class MergerController {

    MergerRepository mergerRepository;

    public MergerController(MergerRepository mergerRepository) {
        this.mergerRepository = mergerRepository;
    }

    @GetMapping
    public List<MenuItemRecord> get() {
        List<MenuItemRecord> items = mergerRepository.getTheMenuItems();
        return items;
    }

    @GetMapping("/vegetarian")
    public List<MenuItemRecord> getVegetarian() {
        return mergerRepository.getTheVegetarianMenuItems();
    }

    @GetMapping("/breakfast")
    public List<MenuItemRecord> getBreakfast() {
        return mergerRepository.getTheBreakfastMenuItems();
    }

    @GetMapping("/lunch")
    public List<MenuItemRecord> getLunch() {
        return mergerRepository.getTheLunchMenuItems();
    }

    @GetMapping("/supper")
    public List<MenuItemRecord> getDinner() {
        return mergerRepository.getTheDinnerMenuItems();
    }
}