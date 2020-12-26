package com.example.demo.test;

import sun.misc.Unsafe;

public class ObjectMonitorTest {

    static Object object = new Object();

    public static void main(String[] args){
        Unsafe unsafe = UnsafeInstance.reflectGetUnsafe();
        unsafe.monitorEnter(object);

        unsafe.monitorExit(object);



    }
}

class ObjectMonitor{

    public void test1(){

    }

    public void test2(){

    }
}
