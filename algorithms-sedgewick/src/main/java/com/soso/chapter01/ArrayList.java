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

    public boolean isEmpty(){
        return size == 0;
    }

    public void addLast(int e){
        add(size,e);
    }

    public void addFirst(int e){
        add(0,e);
    }

    public void add(int index,int e){

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

    @Override
    public String toString() {

        StringBuilder ans = new StringBuilder();
        ans.append(String.format("Array:size = %d,capacity = %d\n",size,data.length));

        ans.append("[");
        for(int i=0; i<size; i++){
            ans.append(data[i]);
            if(i!=size-1){
                ans.append(",");
            }
        }

        ans.append("]");
        return ans.toString();
    }
}
