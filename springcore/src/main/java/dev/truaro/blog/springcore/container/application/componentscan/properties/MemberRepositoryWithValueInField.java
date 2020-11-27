package dev.truaro.blog.springcore.container.application.componentscan.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepositoryWithValueInField {

    @Value("${database.url")
    private String databaseUrl;

}
