package dev.truaro.blog.springcore.application.javaannotation.initializers;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MemberRepository implements InitializingBean {

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
}
