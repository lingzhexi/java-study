package com.codeling.javabase.generics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

//此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
//在实例化泛型类时，必须指定T的具体类型
public class Generic<T> {

    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Generic<Integer> genericInteger = new Generic<>(1233333);
        genericMethod();
    }

    private static void genericMethod() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<Integer> list = new ArrayList<>();
        list.add(2);
//        list.add("a");
        //但凡有点用，也不会一点用都没有
        Class<? extends List> clazz = list.getClass();
        Method add = clazz.getDeclaredMethod("add", Object.class);
        //但是通过反射添加，是可以的
        add.invoke(list, "kl");
        add.invoke(list, 3.4);
        add.invoke(list, false);
        System.out.println(list);
    }
}


interface Generator<T>
{
    public T metod();
}