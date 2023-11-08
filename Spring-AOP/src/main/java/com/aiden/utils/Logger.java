package com.aiden.utils;

import com.aiden.pojo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component("logger")
public class Logger {
    @Before("execution(* com.aiden.service.impl.AccountServiceImpl.addAccount(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        if (args.length > 0 && args[0] instanceof Account) {
            System.out.printf("前置增强：方法执行前，参数为 %s 。\n", args[0]);
            Account account = (Account) args[0];
            System.out.println("原有的账户信息： " + account);

            // 修改账户的数据
            account.setAname("New Era");
            account.setBalance(2000.0);

            System.out.println("新的账户信息： " + account);
        }
    }
}