package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<integer> result = new Arraylist<>();
        if (left < right) {
            for (int i = left; i <= right; i++) {
                result.add(i);

            }
        } else {
            for (int i = right; i >= left; i--) {
                result.add(i);
            }
        }

        return result;
        throw new NotImplementedException();
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<integer> result = new Arraylist<>();
        if (left < right) {
            for (int i = left; i <= right; i++) {
                if (i % 2 == 0) {
                    result.add(i);
                }
            }
        } else {
            for (int i = right; i >= left; i--) {


                result.add(i);

            }
        }

        return result;
        throw new NotImplementedException();
    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream(array).boxed().filter(m -> m % 2 == 0).collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> list = Arrays.stream(secondArray).boxed().collect(Collectors.toList());
        return Arrays.stream(firstArray).boxed().filter(m -> list.contains(m)).collect(Collectors.toList());
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> list1 = Arrays.stream(firstArray).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(secondArray).collect(Collectors.toList());
        list1.addAll(list2);
        return list1.stream().distinct().collect(Collectors.toList());
        throw new NotImplementedException();
    }
}

