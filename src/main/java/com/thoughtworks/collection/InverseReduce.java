package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = number - 2; i >= 0; i -=2) {
            list.add(i);
        }
        return list;
        throw new NotImplementedException();
    }
}
