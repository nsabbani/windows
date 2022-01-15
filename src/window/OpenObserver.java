package window;

public class OpenObserver  extends Observer{

	public OpenObserver(window window) {
		this.window = window;
		this.window.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("window opened");
	}
}
