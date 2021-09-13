package com.soso.chapter01;

/**
 * @Description:
 * @Date:Created in 19:18 2021/9/13
 */
public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
