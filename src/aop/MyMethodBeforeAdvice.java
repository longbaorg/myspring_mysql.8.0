package aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice{
	
	/*
	 * Method method:�����õķ�������
	 * Object[] args:��method�������ݵĲ���
	 * Object target: Ŀ�����
	 */
	
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("��¼��־����"+method.toString()+"//"+args.toString()+"//"+target.toString());
	}
}
