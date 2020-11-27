package dev.truaro.blog.springcore.container.config.javaannotation;

import dev.truaro.blog.springcore.container.application.javaannotation.MemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ApplicationConfigurationWithConstructorInjection.class)
public class RepositoryConfigurationWithImport {

    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }
}
