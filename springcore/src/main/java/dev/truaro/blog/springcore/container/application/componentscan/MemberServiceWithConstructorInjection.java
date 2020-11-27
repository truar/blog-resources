package dev.truaro.blog.springcore.container.application.componentscan;

import org.springframework.stereotype.Service;

@Service // Same as @Component
public class MemberServiceWithConstructorInjection {
    private MemberRepository memberRepository;

    public MemberServiceWithConstructorInjection(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
}
