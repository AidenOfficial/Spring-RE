package com.aiden.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component("aroundLogger")
public class AroundLogger {

    @Around("execution(* com.aiden.service.impl.AccountServiceImpl.addAccount(..))")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕增强：方法执行前。");
        Object result = pjp.proceed();  // 调用目标方法
        System.out.println("环绕增强：方法执行后。");
        return result;
    }
}
