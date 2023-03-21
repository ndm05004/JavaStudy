package chapter08;

public class Audio implements RemoteControl{
	
	private int volume;
	
	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 끕니다.");

	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 켭니다.");

	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOULUME) {
			this.volume = RemoteControl.MIN_VOULUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
		
	}
	

}