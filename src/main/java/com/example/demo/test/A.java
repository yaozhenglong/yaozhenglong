package com.example.demo.test;

public abstract class A implements X{
    String a = "Hello World";

    public void test() {
        System.out.println("父类方法");
    }

    public void handler(String str){
        System.out.println("handler运行"+str);
    }



}
