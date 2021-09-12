package com.soso.chapter01;

/**
 * @Description:
 * @Date:Created in 23:08 2021/9/12
 */
public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();

}
