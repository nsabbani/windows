package window;

public class CloseObserver  extends Observer{

	public CloseObserver(window window) {
		this.window = window;
		this.window.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("window closed");
	}
}
