package dev.truaro.blog.springcore.application.javaannotation;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MemberRepository implements InitializingBean {

    @Value("${database.url}")
    private String databaseUrl;

    @PostConstruct
    void initWithPostConstruct() {

    }

    @PreDestroy
    void cleanUpWthPreDestroy() {

    }

    void cleanUpWithDestroyMethod() {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    public void initWithInitMethod() {
        System.out.println(databaseUrl);
    }
}
