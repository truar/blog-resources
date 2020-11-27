package dev.truaro.blog.springcore.aspect.application;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

@Component
@Aspect
public class ServiceCallTracker {

    @Before("execution(* HelloWorldService.*(..))")
    public void beforeAdvice() {
        System.out.println("ServiceCallTracker.beforeAdvice");
    }

    @Before("execution(* HelloWorldService.*(..))")
    public void beforeAdviceWithJoinPoint(JoinPoint joinPoint) {
        System.out.println("Target bean name = " + joinPoint.getTarget());

        String args = Arrays.stream(joinPoint.getArgs())
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println("Target method args = " + args );

        System.out.println("Target method signature = " + joinPoint.getSignature().getName());
    }

//    @Before("execution(* HelloWorldService.*(..))")
    public void beforeAdviceBlockingTheTarget() {
        throw new RuntimeException("Target is not reached");
    }

    @AfterReturning(value = "execution(* HelloWorldService.*(..))", returning = "targetResult")
    public void afterReturningAdvice(Object targetResult) {
        System.out.println("AfterReturning advice getting the result from the target method: " + targetResult);
    }

    @AfterReturning(value = "execution(* HelloWorldService.*(..))", returning = "targetResult")
    public void afterReturningAdviceForSpecificObject(String targetResult) {
        System.out.println("AfterReturning advice getting only String object: " + targetResult);
    }

    @AfterThrowing(value = "execution(* HelloWorldService.*(..))", throwing = "targetException")
    public void passingThroughAfterThrowingAdvice(Exception targetException) {
        System.out.println("Passing through AfterThrowing advice: " + targetException);
    }

    @AfterThrowing(value = "execution(* HelloWorldService.*(..))", throwing = "targetException")
    public void afterThrowingAdviceSpecificException(IllegalArgumentException targetException) {
        System.out.println("AfterThrowing advice only intercepting IllegalArgumentException: " + targetException);
    }

    @AfterThrowing(value = "execution(* HelloWorldService.*(..))", throwing = "targetException")
    public void afterThrowingAdviceSendingNewException(IllegalArgumentException targetException) {
        throw new RuntimeException("Encapsulating the exception into a new one", targetException);
    }

    @After("execution(* HelloWorldService.*(..))")
    public void afterAdvice() {
        System.out.println("Either the method terminated normally or with an exception. We don't know.");
    }

    @Around("execution(* HelloWorldService.*(..))")
    public Object aroundAdviceControllingTheExecutionFlow(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            // do things before
            Object proceed = proceedingJoinPoint.proceed();// call the target method
            // do things after
            return proceed;
        } catch (Throwable e) {
            // do things in case of exception
            throw new RuntimeException("I return an exception. But I could also return a value", e);
        }
    }

    @Before("execution(* HelloWorldService.*(..))")
    public void trackAllServiceMethodBefore(JoinPoint joinPoint) {
        System.out.println("Before calling " +
                joinPoint.getKind() +
                "." +
                joinPoint.getSignature().getName());
    }

}
