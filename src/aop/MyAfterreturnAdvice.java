package aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterreturnAdvice implements AfterReturningAdvice {

	/*arg0����ֵ
	 * Method method:�����õķ�������
	 * Object[] args:��method�������ݵĲ���
	 * Object target: Ŀ�����
	 */
	
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("�ر���Դ������"+arg3.toString());
	}

}
