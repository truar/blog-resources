package dev.truaro.blog.springcore.container.application.javaannotation;

import org.springframework.beans.factory.annotation.Value;

public class MemberRepository {

    @Value("${database.url}")
    private String databaseUrl;

    public void initWithInitMethod() {
        System.out.println(databaseUrl);
    }

    private void cleanUpWithDestroyMethod() {
        System.out.println("MemberRepository.cleanUpWithDestroyMethod");
    }
}
