package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Program {
    public static void main(String[] args) {
    
        ApplicationContext context = new ClassPathXmlApplicationContext("settingA.xml");
        Exam exam = (Exam) context.getBean("exam");
        System.out.printf("total is %d\n", exam.total());
        System.out.printf("avg is %3.2f\n", exam.avg());
        
//        Exam exam = new NewlecExam(1, 1, 1, 1);
//
//        Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), new Class[]{Exam.class}, new InvocationHandler() {
//
//            @Override//AOP관점지향 프로그밍의 방법입니다.
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                long start = System.currentTimeMillis();
//
//                Object result = method.invoke(exam, args);
//
//                long end = System.currentTimeMillis();
//
//                String message = (end - start) + "ms 시간이 걸렸습니다.";
//
//                System.out.println(message);
//
//                return result;
//            }
//        });
    }
}
