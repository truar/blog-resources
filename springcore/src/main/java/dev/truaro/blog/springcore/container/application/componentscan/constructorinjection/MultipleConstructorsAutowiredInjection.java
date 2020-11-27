package dev.truaro.blog.springcore.container.application.componentscan.constructorinjection;

import dev.truaro.blog.springcore.container.application.componentscan.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultipleConstructorsAutowiredInjection {

    private MemberRepository repository;

    @Autowired // Called by Spring
    public MultipleConstructorsAutowiredInjection(MemberRepository repository) {
        this.repository = repository;
    }
    // Ignored
    public MultipleConstructorsAutowiredInjection(String parameter) { }

}
