package org.springframework.myself;

import org.springframework.aop.aspectj.annotation.ArgumentBindingTests;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.ProxyFactoryBean;

/**
 * @author: xiajun003
 * @Date: 2019/3/31 17:04
 * @Description:
 */
public class TestAop {

    public static void main(String[] args) throws ClassNotFoundException {


        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setProxyInterfaces(new Class[]{abcInterface.class});
        proxyFactoryBean.setTarget(abcTarget.class);
        proxyFactoryBean.setInterceptorNames();
        abcInterface object = (abcInterface)proxyFactoryBean.getObject();
        object.say();


    }

    interface abcInterface{
        void say();
    }

    class abcTarget implements abcInterface{

        @Override
        public void say() {
            System.err.println("abc implent");
        }
    }
}
