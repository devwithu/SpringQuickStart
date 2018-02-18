package polymorphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("==> SamsungTV(1) 객체 생성");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("==> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}
	
	
	
	public SamsungTV(Speaker speaker, int price) {
		super();
		System.out.println("==> SamsungTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void initMethod(){
		System.out.println("====> SamsungTV() 객체초기화");
	}
	
	public void destroyMethod(){
		System.out.println("====> SamsungTV() 객체소멸");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV --전원켜다.(가격 : " + price + ")");
	}
	public void powerOff() {
		System.out.println("SamsungTV --전원끄다.");
	}
	public void volumeUp() {
		speaker.volumeup();
		//System.out.println("SamsungTV --소리올리다.");
	}
	public void volumeDown() {
		speaker.volumeDown();
		//System.out.println("SamsungTV --소리내리다.");
	}
	
}
