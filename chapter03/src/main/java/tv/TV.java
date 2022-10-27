package tv;

public class TV {
	private int channel;	// 1 ~ 255 사이 값을 가지게 하고 넘어 갈 때는 라운딩 시킬 것
	private int volume;		// 0 ~ 100 사이 값을 가지게 하고 넘어 갈 때는 라운딩 시킬 것
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void status() {
		System.out.println("TV [channel = " + channel + ", volume = " + volume + ", power = " + (power ? "On" : "Off") +" ]");
	}

	public void power(boolean on) {
		this.power = on;
	}

	public void volume(int volume) {
		if(volume > 100) {
			this.volume = 0;
		}else if(volume < 0) {
			this.volume = 100;
		}else {
			this.volume = volume;
		}
	}

	public void volume(boolean up) {
		if(up) {
			this.volume = volume + 1;
		}else {
			this.volume = volume - 1;
		}
		volume(this.volume);
	}
	
	public void channel(int channel) {
		if(channel > 255) {
			this.channel = 1;
		}else if(channel < 1) {
			this.channel = 255;
		}else {
			this.channel = channel;
		}
	}

	public void channel(boolean up) {
		if(up) {
			this.channel = channel + 1;
		}else {
			this.channel = channel - 1;
		}
		channel(this.channel);
	}
}
