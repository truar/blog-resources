package dev.truaro.blog.springcore.container.application.componentscan.properties;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepositoryWithEnvironment {
    private String databaseUrl;

    public MemberRepositoryWithEnvironment(Environment environment) {
        this.databaseUrl = environment.getProperty("database.url");
    }
}
