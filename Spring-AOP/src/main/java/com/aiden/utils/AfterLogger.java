package com.aiden.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component("afterLogger")
public class AfterLogger {

    @After("execution(* com.aiden.service.impl.AccountServiceImpl.addAccount(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println("后置增强：方法执行完成。");
    }
}
