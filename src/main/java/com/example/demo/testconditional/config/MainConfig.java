package com.example.demo.testconditional.config;

import com.example.demo.testconditional.compent.TulingAspect;
import com.example.demo.testconditional.compent.TulingLog;
import com.example.demo.testconditional.condition.TulingCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * Created by YanceyYao on 2019/5/20.
 */
public class MainConfig {

    //@Bean
    public TulingAspect tulingAspect() {
        return new TulingAspect();
    }

    @Bean
    @Conditional(value = TulingCondition.class)
    public TulingLog tulingLog() {
        return new TulingLog();
    }
}
