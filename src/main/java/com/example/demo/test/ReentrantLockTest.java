package com.example.demo.test;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    private static int counter = 0;
    private ReentrantLock lock = new ReentrantLock(true);

    public void modifyResources(String threadName){
        System.out.println("通知《管理员》线程：------>"+threadName+"准备打水。");
        lock.lock();
        System.out.println("线程："+threadName+"------->"+"第一次加锁。");
        counter++;
        System.out.println("线程：------->"+threadName+"打第："+counter+"桶水。");
        lock.lock();
        System.out.println("线程："+threadName+"------->"+"第二次加锁。");
        counter++;
        System.out.println("线程：------->"+threadName+"打第："+counter+"桶水。");
        lock.unlock();
        System.out.println("线程：---"+threadName+"---->"+"释放一个锁。");
        lock.unlock();
        System.out.println("线程：---"+threadName+"---->"+"释放一个锁。");


    }


    public static void main(String[] args) {
        ReentrantLockTest lock = new ReentrantLockTest();
        new Thread(() -> {
            String threadName = Thread.currentThread().getName();
            lock.modifyResources(threadName);

        },"Thread：姚正龙").start();

        new Thread(() -> {
            String threadName = Thread.currentThread().getName();
            lock.modifyResources(threadName);
        },"小龙女").start();


    }
}
