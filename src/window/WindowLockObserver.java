package window;

public class WindowLockObserver extends Observer{

	public WindowLockObserver(window window) {
		this.window = window;
		this.window.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Window lock status: "+window.getLockStatus());
	}
}

