package com.example.demo.testimport.config;

import com.example.demo.testimport.compent.Car;
import com.example.demo.testimport.compent.Person;
import com.example.demo.testimport.importselect.TulingBeanDefinitionRegister;
import com.example.demo.testimport.importselect.TulingImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by YanceyYao on 2019/5/20.
 */
@Configuration
//@Import(value = {Person.class, Car.class})
@Import(value = {Person.class, Car.class, TulingImportSelector.class})
//@Import(value = { TulingBeanDefinitionRegister.class})
public class MainConfig {
}
