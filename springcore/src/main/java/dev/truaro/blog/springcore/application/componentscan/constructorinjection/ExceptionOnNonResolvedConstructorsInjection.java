package dev.truaro.blog.springcore.application.componentscan.constructorinjection;

import dev.truaro.blog.springcore.application.componentscan.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class ExceptionOnNonResolvedConstructorsInjection {

    private MemberRepository repository;

    public ExceptionOnNonResolvedConstructorsInjection(MemberRepository repository) {
        this.repository = repository;
    }
    public ExceptionOnNonResolvedConstructorsInjection(String parameter) { }

}
