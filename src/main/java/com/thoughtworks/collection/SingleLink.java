package com.thoughtworks.collection;

public interface SingleLink<T> {
    public T getHeaderData();
    public T getTailData();
    public int size();
    public boolean isEmpty();
    public boolean deleteFirst();
    public boolean deleteLast();                //ɾ��β��Ԫ�أ�
    public void addHeadPointer(T item);    //���ͷָ��
    public void addTailPointer(T item);         //���βָ��
    public T getNode(int index);
}

