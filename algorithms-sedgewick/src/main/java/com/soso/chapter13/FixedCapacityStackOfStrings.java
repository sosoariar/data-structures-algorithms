package com.soso.chapter13;

/**
 * @Description: 固定容量的数组栈
 * @Date:Created in 0:04 2021/9/5
 */
public class FixedCapacityStackOfStrings {

    private String[] a; // stack entries
    private int N; // 表示实际存了多少

    // cap 最大可以存储容量
    public FixedCapacityStackOfStrings(int cap) {
        a = new String[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(String item) {
        a[N++] = item;
    }

    public String pop() {
        return a[--N];
    }

    public static void main(String[] args) {

        FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(100);

        String input = "str-i-ng";
        String[] targetArr = new String[input.length()];

        for(int i=0; i<input.length()-1; i++){
            targetArr[i] = String.valueOf(input.charAt(i));
        }

        for(String target:targetArr){
            if(!target.equals("-")){
                stack.push(target);
            }else{
                stack.pop();
            }
        }
        System.out.println("(" + stack.size() + " left on stack)");
    }
}
