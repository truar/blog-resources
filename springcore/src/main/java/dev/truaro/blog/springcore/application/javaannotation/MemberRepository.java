package dev.truaro.blog.springcore.application.javaannotation;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

public class MemberRepository {

    @Value("${database.url}")
    private String databaseUrl;

    public void initWithInitMethod() {
        System.out.println(databaseUrl);
    }
}
