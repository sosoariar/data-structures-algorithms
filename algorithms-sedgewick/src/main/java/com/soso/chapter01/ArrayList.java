package com.soso.chapter01;

/**
 * @Description:
 * 1. 解决固定容量问题
 * @Date:Created in 13:37 2021/9/12
 */
public class ArrayList {

    private int[] data;

    private int size;

    public ArrayList(int capacity){
        data = new int[capacity];
        size = 0;
    }

    public ArrayList(){
        this(16);
    }

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    private boolean isEmpty(){
        return size == 0;
    }

    private void addLast(int e){

        if(size == data.length){
            throw new IllegalArgumentException("Add failed. Array is full.");
        }

        data[size] = e;
        size++;

    }

    private void add(int index,int e){

        if(size == data.length){
            throw new IllegalArgumentException("Add failed. Array is full.");
        }

        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        }

        for(int i = size - 1; i >= index ; i --){
            data[i + 1] = data[i];
        }

        data[index] = e;
        size ++;
    }
}
