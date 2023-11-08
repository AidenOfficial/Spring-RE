package com.aiden.advice;

import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

public class CustomBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) {
        System.out.println("前置增强：方法 " + method.getName() + " 将要执行。");
    }
}
