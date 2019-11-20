package com.aisino.test.boot;

import com.aisino.test.aop.IMathCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xiajun003
 * @Date: 2019/11/20 14:42
 * @Description:
 */
public class TestAop {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:test/aop-config.xml");

        IMathCalculator mathCalculator = applicationContext.getBean(IMathCalculator.class);
        int div = mathCalculator.div(2, 1);
        System.err.println(div);

    }
}
