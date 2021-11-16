package com.sarkar.dsa.ds.list;

public interface List<T> {

    public boolean add(T data);

    public void insertAt(long index, T value);

    public void deleteAt(long index);

    public int isAvailable(T date);

    public int size();

    public void display();

}
