package dev.truaro.blog.springcore.container.application.componentscan.constructorinjection;

import org.springframework.stereotype.Service;

@Service
public class DefaultConstructorInjection {
    // No constructor found, Spring invokes new DefaultConstructorInjection
}
