package dev.truaro.blog.springcore.container.config.javaannotation.profiles;

import dev.truaro.blog.springcore.container.application.javaannotation.MemberRepository;
import dev.truaro.blog.springcore.container.application.javaannotation.MemberService;
import org.springframework.context.annotation.*;

@Configuration
@Profile("jdbc") // All beans are linked to the jdbc profile
public class ApplicationConfigurationWithProfileOnClass {

    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }

    @Bean
    public MemberService memberService(MemberRepository memberRepository) {
        return new MemberService(memberRepository);
    }
}
