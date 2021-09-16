package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return Collections.max(arrayList);
        throw new NotImplementedException();
    }

    public double getMinimum() {
        return Collections.min(arrayList);
        throw new NotImplementedException();
    }

    public double getAverage() {
        return arrayList.stream().mapToInt(x->x).average().getAsDouble();
        throw new NotImplementedException();
    }

    public double getOrderedMedian() {
        int size = arrayList.size();
        if(size % 2 == 1){
            return arrayList.get(size/2);
        }else{
            return(arrayList.get(size / 2 -1) + arrayList.get(size / 2))/ 2.0;
        }

        throw new NotImplementedException();
    }

    public int getFirstEven() {
        return arrayList.stream().filter(x -> x % 2 == 0).findFirst().get();
        throw new NotImplementedException();
    }

    public int getIndexOfFirstEven() {
        for (int i = 0; i <= arrayList.size() ; i++) {
            if(arrayList.get(i) % 2 == 0){
                return i;
            }

        }
        return -1;
        throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        if(this.arrayList.size() == arrayList.size()){
            for (int i = 0; i < arrayList.size(); i++) {
                if(this.arrayList.get(i) != arrayList.get(i)){
                    return false;
                }
            }
            return true;
        }
        else {
            return  false;
        }
        throw new NotImplementedException();
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
    }

    public int getLastOdd() {
        List<Integer> list = arrayList.stream().filter(x -> x % 2 == 1).collect(Collectors.toList());
        return list.get(list.size() - 1);
        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        List<Integer> list = arrayList.stream().filter(x -> x % 2 == 1).collect(Collectors.toList());
        return list.get(list.size() - 1);
        throw new NotImplementedException();
    }
}
