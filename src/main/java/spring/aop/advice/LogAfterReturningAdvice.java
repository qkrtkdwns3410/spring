package spring.aop.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LogAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target2) throws Throwable {
        System.out.println("return Value:"+returnValue+", method:"+method.getName());
        
    }
}
