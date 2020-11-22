package dev.truaro.blog.springcore.application.javaannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:database.properties")
public class MemberRepository {

    @Value("${database.url}")
    private String databaseUrl;

    public void init() {
        System.out.println(databaseUrl);
    }
}
