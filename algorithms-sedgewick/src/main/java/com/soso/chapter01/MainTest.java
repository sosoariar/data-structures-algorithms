package com.soso.chapter01;

import org.junit.Test;

/**
 * @Description:
 * @Date:Created in 20:38 2021/9/12
 */
public class MainTest {

    @Test
    public void testArrayList01(){
        ArrayList arr = new ArrayList(20);

        for (int i = 0; i < 10; i++) {
            arr.addLast(i+1);
        }

        System.out.println(arr);
        arr.addFirst(99);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.removeElement(4);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);
    }

    @Test
    public void testArrayList02(){

        ArrayList arr = new ArrayList();

        for (int i = 0; i < 16; i++) {
            arr.addLast(i+1);
        }

        arr.add(1, 100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.removeElement(4);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);
    }

}
