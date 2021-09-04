package com.soso.chapter13;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Description: 算法求值表达式
 * @Date:Created in 23:33 2021/9/4
 * @Author：soso
 */
public class Evaluate {
    public static void main(String[] args) {

        String target = "(1+((2+3)*(4*5)))";
        String[] targetArr = new String[target.length()];

        for(int i=0; i<target.length()-1; i++){
            targetArr[i] = String.valueOf(target.charAt(i));
        }

        Deque<String> ops = new LinkedList<>();
        Deque<Double> vals = new LinkedList<>();

        for(String s:targetArr){
            if(s == null){
                break;
            }
            if (s.equals("(")) {
                continue;
            } else if (s.equals("+")) {
                ops.push(s);
            } else if (s.equals("-")) {
                ops.push(s);
            } else if (s.equals("*")) {
                ops.push(s);
            } else if (s.equals("/")) {
                ops.push(s);
            } else if (s.equals("sqrt")) {
                ops.push(s);
            } else if (s.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) {
                    v = vals.pop() + v;
                } else if (op.equals("-")) {
                    v = vals.pop() - v;
                } else if (op.equals("*")) {
                    v = vals.pop() * v;
                } else if (op.equals("/")) {
                    v = vals.pop() / v;
                } else if (op.equals("sqrt")) {
                    v = Math.sqrt(v);
                }
                vals.push(v);
            } else {
                vals.push(Double.parseDouble(s));
            }
        }
        System.out.println(vals.pop());
    }
}
