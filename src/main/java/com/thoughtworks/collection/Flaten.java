package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        return array.stream().flatMap(x -> Arrays.stream(x)).collect(Collectors.toList());
        throw new NotImplementedException();
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        return Arrays.stream(array).flatMap(x -> Arrays.stream(x)).distinct().collect(Collectors.toList());
        throw new NotImplementedException();
    }
}
