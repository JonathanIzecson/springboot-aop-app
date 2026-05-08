package com.example.springboot.aop_app.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingPointCutService {

    @Pointcut("execution(* com.example.springboot.aop_app.services.GreetingService.greet(..))")
    public void greetingPointcut() {
    }
}
