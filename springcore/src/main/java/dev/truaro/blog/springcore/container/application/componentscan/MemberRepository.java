package dev.truaro.blog.springcore.container.application.componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository // Same as @Component
public class MemberRepository {

    @Value("${database.url}")
    private String databaseUrl;
}

