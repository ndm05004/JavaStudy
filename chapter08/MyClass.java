package chapter08;

public class MyClass {
	
	RemoteControl rc = new Television();
	
	public MyClass() {
		// TODO Auto-generated constructor stub
	}
	
	public MyClass(RemoteControl rc) {
		// TODO Auto-generated constructor stub
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}

}
