package com.aiden.advisor;

import com.aiden.advice.CustomBeforeAdvice;
import com.aiden.service.AccountService;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

public class CustomAdvisor extends StaticMethodMatcherPointcutAdvisor {

    public CustomAdvisor() {
        setAdvice(new CustomBeforeAdvice());
        setClassFilter(new ClassFilter() {
            @Override
            public boolean matches(Class<?> clazz) {
                return clazz.isAssignableFrom(AccountService.class);
            }
        });
    }

    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        return "addAccount".equals(method.getName());
    }
}
