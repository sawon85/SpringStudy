package hello.hellospring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;

@Aspect
@Component
public class TimeTraceAop {

    //@Around("execution(* hello.hellospring..*(..))")
    @Around("execution(* hello.hellospring.service..*(..))")
    public Object excute(ProceedingJoinPoint joinPoint) throws Throwable {

        long start = System.currentTimeMillis();
        System.out.print("START : " + joinPoint.toString());

        try {
            return joinPoint.proceed();
        } finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("END:" + joinPoint.toString() + " " + timeMs + "ms");
        }

    }
}
