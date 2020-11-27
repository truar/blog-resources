package dev.truaro.blog.springcore.aspect.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("dev.truaro.blog.springcore.aspect.application")
public class AspectConfiguration {
}
