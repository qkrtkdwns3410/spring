package spring.aop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class LogBeforeAdvice implements  MethodBeforeAdvice{
    
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("앞에서 실행될 로직입니다.");
    
    }
}
