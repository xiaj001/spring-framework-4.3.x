package com.aisino.test.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author: xiajun003
 * @Date: 2019/11/14 20:59
 * @Description:
 */
public class Advisior implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.err.println("MethodBeforeAdvice");
    }
}
