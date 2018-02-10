package polymorphism;

public class SamsungTV implements TV{

	public void powerOn() {
		System.out.println("SamsungTV --전원켜다.");
	}
	public void powerOff() {
		System.out.println("SamsungTV --전원끄다.");
	}
	public void volumeUp() {
		System.out.println("SamsungTV --소리올리다.");
	}
	public void volumeDown() {
		System.out.println("SamsungTV --소리내리다.");
	}
	
}
