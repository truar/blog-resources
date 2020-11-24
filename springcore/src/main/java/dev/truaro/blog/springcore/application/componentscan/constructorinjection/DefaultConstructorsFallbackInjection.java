package dev.truaro.blog.springcore.application.componentscan.constructorinjection;

import dev.truaro.blog.springcore.application.componentscan.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultConstructorsFallbackInjection {
    private MemberRepository repository;

    // Called by Spring
    public DefaultConstructorsFallbackInjection() { }

    // Ingored
    public DefaultConstructorsFallbackInjection(MemberRepository repository) {
        this.repository = repository;
    }
}
