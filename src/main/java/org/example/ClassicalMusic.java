package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Do my init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Do my destroy");
    }

    @Override
    public String getSong() {
        return "Ave Maria";
    }
}
