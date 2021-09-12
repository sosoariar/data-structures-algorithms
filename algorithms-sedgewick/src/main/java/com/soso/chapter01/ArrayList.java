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
}
