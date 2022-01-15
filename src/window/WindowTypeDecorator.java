package window;

public abstract class WindowTypeDecorator implements WindowType {
	protected WindowType windowDecorator;
	public WindowTypeDecorator(WindowType windowDecorator) {
		this.windowDecorator = windowDecorator;
	}
	
	public void windowType() {
		windowDecorator.windowType();
	}
}
