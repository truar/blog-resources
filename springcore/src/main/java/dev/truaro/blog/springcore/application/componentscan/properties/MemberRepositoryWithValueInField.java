package dev.truaro.blog.springcore.application.componentscan.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepositoryWithValueInField {

    @Value("${database.url")
    private String databaseUrl;

}
