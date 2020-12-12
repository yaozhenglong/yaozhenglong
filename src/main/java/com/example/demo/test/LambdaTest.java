package com.example.demo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("linqingxia");
        list.add("zhangmanyu");
        list.add("wangzuxian");
        list.add("liuyan");
        list.add("zhangmin");
        list.add("zhangwuji");
        long startTime = System.currentTimeMillis();
        list.stream().filter(s -> s.startsWith("小")).filter(s -> s.length() == 3).forEach(System.out::println);
        long endTime = System.currentTimeMillis();
        System.out.println("不用parallel运行时间："+(endTime-startTime)+"ms");

        long startTime2 = System.currentTimeMillis();
        list.stream().filter(s -> s.startsWith("小")).filter(s -> s.length() == 3).parallel().forEach(System.out::println);
        long endTime2 = System.currentTimeMillis();
        System.out.println("用parallel运行时间："+(endTime2-startTime2)+"ms");
        Map<String, Object> map = new ConcurrentHashMap<>();

        //System.out.println("---------------------");
        //list.stream().limit(3).forEach(System.out::println);

        //System.out.println("----跳过3个-----------");
        //list.stream().skip(3).forEach(System.out::println);

        //System.out.println("----跳过3个获得前两个----------------");
        //list.stream().skip(3).limit(2).forEach(System.out::println);
        System.out.println("---------------------");
        //Stream<String> s1 = list.stream().limit(4);

        //Stream<String> s2 = list.stream().skip(2);

        //Stream.concat(s1,s2);

        //System.out.println("去除重复的----------");
        //Stream.concat(s1,s2).distinct().forEach(System.out::println);
        //list.stream().sorted((s1,s2) -> s1.length() - s2.length()).forEach(System.out::println);

    }

    private static void testLambda(Lambda lambda) {
        int res = lambda.add(30);

        System.out.println("输出结果：" + res);
    }
}
