package aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice{
	
	/*
	 * Method method:被调用的方法名字
	 * Object[] args:给method方法传递的参数
	 * Object target: 目标对象
	 */
	
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("记录日志。。"+method.toString()+"//"+args.toString()+"//"+target.toString());
	}
}
