package aop;

public class TestService1 implements TestServiceInterface , TestServiceInterface2 {
	@Override
	public void sayhellow() {
		// TODO Auto-generated method stub
		System.out.println("TestService1��hellow����");
	}

	@Override
	public void saybey() {
		// TODO Auto-generated method stub
		System.out.println("TestService1��saybay����");
	}
}
