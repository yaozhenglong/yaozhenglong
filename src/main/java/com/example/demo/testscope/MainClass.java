package com.example.demo.testscope;

import com.example.demo.testscope.compent.Person;
import com.example.demo.testscope.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by YanceyYao on 2019/5/20.
 */
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
//        Person person = (Person) ctx.getBean("person");
//        Person person2 = (Person) ctx.getBean("person");
//        System.out.println(person==person2);
    }
}
