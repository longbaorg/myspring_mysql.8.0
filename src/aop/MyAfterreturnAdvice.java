package aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterreturnAdvice implements AfterReturningAdvice {

	/*arg0返回值
	 * Method method:被调用的方法名字
	 * Object[] args:给method方法传递的参数
	 * Object target: 目标对象
	 */
	
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("关闭资源。。。"+arg3.toString());
	}

}
