package dev.truaro.blog.springcore.container.application.componentscan.constructorinjection;

import dev.truaro.blog.springcore.container.application.componentscan.MemberRepository;

//@Service
public class ExceptionOnNonResolvedConstructorsInjection {

    private MemberRepository repository;

    public ExceptionOnNonResolvedConstructorsInjection(MemberRepository repository) {
        this.repository = repository;
    }
    public ExceptionOnNonResolvedConstructorsInjection(String parameter) { }

}
