package spring.aop.advice;

import com.sun.xml.internal.ws.api.pipe.ThrowableContainerPropertySet;
import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice {
    public void afterThrowing(IllegalArgumentException e)throws Throwable {
        System.out.println("μμΈλ°μ: "+e.getMessage());
    }
}
