package com.example.demo.test;

import sun.misc.Unsafe;

public class VolatileTest {
    private String name;
    private volatile int age;

    private static final Unsafe unsafe = UnsafeInstance.reflectGetUnsafe();
    private static final long valueOffset;

    static {
        try {
            valueOffset = unsafe.objectFieldOffset(VolatileTest.class.getDeclaredField("age"));
            System.out.println("valueOffset====>"+valueOffset);
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public void compareAndSwapAge(int old,int target){
        unsafe.compareAndSwapInt(this,valueOffset,old,target);
    }
    public VolatileTest(String name,int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }



    public static void main(String[] args){
        VolatileTest volatileTest = new VolatileTest("姚正龙",18);
        volatileTest.compareAndSwapAge(18,31);
        //volatileTest.setAge(32);
        System.out.println("真实的姚正龙年龄---"+volatileTest.getAge());


    }
}
