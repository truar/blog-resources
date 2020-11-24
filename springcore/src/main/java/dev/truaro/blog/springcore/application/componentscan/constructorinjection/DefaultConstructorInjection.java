package dev.truaro.blog.springcore.application.componentscan.constructorinjection;

import org.springframework.stereotype.Service;

@Service
public class DefaultConstructorInjection {
    // No constructor found, Spring invokes new DefaultConstructorInjection
}
