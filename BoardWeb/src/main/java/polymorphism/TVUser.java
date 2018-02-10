package polymorphism;

public class TVUser {

	public static void main(String[] args) {
		
		//TV tv = new LgTV();
		
		BeanFactory beanFactory = new BeanFactory();
		TV tv = (TV)beanFactory.getBean(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
	}
}
