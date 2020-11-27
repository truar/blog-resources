package dev.truaro.blog.springcore.container.application.componentscan.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceWithSpelBeanReference {

    @Value("#{memberRepository.databaseUrl}")
    private String databaseUrl;
}
