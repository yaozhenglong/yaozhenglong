package com.example.demo.test.jvm;

public class TestDynamicLoad {

    static {
        System.out.println("*************load TestDynamicLoad************");//第一加载
    }

    public static void main(String[] args) {
        new A();
        System.out.println("*************load test************");//第四
        B b = null;  //B不会加载，除非这里执行 new B()
    }
}
class A {
    static {
        System.out.println("*************load A************");//第二加载
    }

    public A() {
        System.out.println("*************initial A************");//第三加载
    }
}

class B {
    static {
        System.out.println("*************load B************");//第五加载
    }

    public B() {
        System.out.println("*************initial B************");//第六加载
    }
}
