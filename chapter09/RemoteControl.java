package chapter09;

public interface RemoteControl {
	
	public int MAX_VOLUME = 10;
	public int MIN_VOULUME = 0;
	
	public void turnOn();
	public void turnoff();
	public void setVolume(int volume);

}
