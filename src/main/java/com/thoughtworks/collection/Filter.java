package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {

     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> list =  arrayList.stream().filter(m -> m % 2 == 0).collect(Collectors.toList());
        return list;
        throw new NotImplementedException();
    }

    public List<Integer> filterMultipleOfThree() {
        return array.stream().filter(m -> m % 3 == 0).collect(Collectors.toList());
        throw new NotImplementedException();
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        return firstList.stream.filter(m -> secondList.contans(m)).collect(Collectors.toList());
        throw new NotImplementedException();
    }

    public List<Integer> getDifferentElements() {
        return array.stream().distinct().collect(Collectors.toList());
        throw new NotImplementedException();
    }
}