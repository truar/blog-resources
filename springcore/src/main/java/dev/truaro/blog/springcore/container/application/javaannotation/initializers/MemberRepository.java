package dev.truaro.blog.springcore.container.application.javaannotation.initializers;

import org.springframework.beans.factory.InitializingBean;

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
