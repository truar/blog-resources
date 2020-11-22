package dev.truaro.blog.springcore.application.componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

@Repository // Same as @Component
@PropertySource("classpath:database.properties")
public class MemberRepository {

    @Value("${database.url}")
    private String databaseUrl;

    public MemberRepository(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }
}

