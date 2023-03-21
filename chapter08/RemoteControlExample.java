package chapter08;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		rc = new Television();
		rc.turnoff();
		rc = new Audio();
		
		rc.turnoff();

	}

}
