package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergerRepositoryTest {

    @Test
    void getTheVegetarianMenuItems() {
        MergerRepository mergerRepository = new MergerRepository();
        System.out.println(mergerRepository.getTheVegetarianMenuItems());
    }

    @Test
    void getTheBreakfastMenuItems() {
        MergerRepository mergerRepository = new MergerRepository();
        System.out.println(mergerRepository.getTheBreakfastMenuItems());
    }
}