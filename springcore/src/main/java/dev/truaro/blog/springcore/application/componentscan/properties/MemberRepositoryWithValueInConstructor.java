package dev.truaro.blog.springcore.application.componentscan.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepositoryWithValueInConstructor {

    private String databaseUrl;

    public MemberRepositoryWithValueInConstructor(
            @Value("${database.url") String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }
}
