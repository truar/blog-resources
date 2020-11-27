package dev.truaro.blog.springcore.container.application.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Same as @Component
public class MemberServiceWithFieldInjection {
    @Autowired
    private MemberRepository memberRepository;

}
