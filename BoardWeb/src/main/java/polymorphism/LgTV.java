package polymorphism;

public class LgTV implements TV{


	@Override
	public void powerOn() {
		System.out.println("LgTV --전원켜다.");
		
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV --전원끄다.");
		
	}
	@Override
	public void volumeUp() {
		System.out.println("LgTV --소리올리다.");
		
	}
	@Override
	public void volumeDown() {
		System.out.println("LgTV --소리내리다.");
		
	}
	
}
