package dev.truaro.blog.springcore.application.componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository // Same as @Component
public class MemberRepository {

    @Value("${database.url}")
    private String databaseUrl;
}

