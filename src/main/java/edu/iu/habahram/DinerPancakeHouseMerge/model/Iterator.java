package edu.iu.habahram.DinerPancakeHouseMerge.model;

public interface Iterator<T> {
    boolean hasNext();

    MenuItem next();

    void remove();
}
