package dev.truaro.blog.springcore.application.componentscan.constructorinjection;

import dev.truaro.blog.springcore.application.componentscan.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class OnlyOneConstructorInjection {

    private MemberRepository repository;

    // Called by Spring
    public OnlyOneConstructorInjection(MemberRepository repository) {
        this.repository = repository;
    }
}
