package com.aiden.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component("afterThrowingLogger")
public class AfterThrowingLogger {

    @AfterThrowing(pointcut = "execution(* com.aiden.service.impl.AccountServiceImpl.triggerException(..))", throwing = "ex")
    public void logAfterThrowing(JoinPoint joinPoint, Exception ex) {
        System.out.println("异常增强：方法 " + joinPoint.getSignature().getName() + " 抛出了异常: " + ex.getMessage());
    }
}

