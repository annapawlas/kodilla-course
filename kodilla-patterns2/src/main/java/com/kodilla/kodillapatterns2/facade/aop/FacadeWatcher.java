package com.kodilla.kodillapatterns2.facade.aop;

import com.kodilla.kodillapatterns2.facade.api.OrderDto;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FacadeWatcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);

    @Before("execution(* com.kodilla.kodillapatterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEventBefore(){
        LOGGER.info("Starting processing the order");
    }

    @Around("execution(* com.kodilla.kodillapatterns2.facade.api.OrderFacade.processOrder(..))")
    public Object logEventAround(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        Object result;
        try {
            Long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            Long end = System.currentTimeMillis();
            LOGGER.info("Time consumed " + (end - begin) + "[ms]");
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}
