package com.aiden.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component("afterReturningLogger")
public class AfterReturningLogger {

    @AfterReturning(pointcut = "execution(* com.aiden.service.impl.AccountServiceImpl.addAccount(..))", returning = "result")
    public void afterReturningAdvice(JoinPoint joinPoint, Object result) {
        System.out.println("返回后增强：方法执行成功，返回结果：" + result);
    }
}
