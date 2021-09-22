package com.codeling.javabase.base;

import java.sql.Connection;

public class Condition
{
    public static void main(String[] args) {
        Condition condition = new Condition();
        String s = condition.toString();
        System.out.println(s);
    }
    @Override //重写
    public String toString() {
        return "condition";
    }
    //    public static void main(String[] args) {
//        int num = 0;
//        while (num <5) {
//            if (num == 3) { //num 等于 3
//                System.out.println("跳过3");
//                num++;
//                continue; //跳过当前的循环执行下一次循环
//            }
//            System.out.println("num：" + num);
//            num++;
//        }
//    }
}
