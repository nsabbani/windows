package window;

public class windowObserverDesignPatternDemo  {
	public static void main(String[] args) {
		window window = new window();
		//new OpenObserver(window);
		//new CloseObserver(window);
		new WindowLockObserver(window);
		
		System.out.println("Call window lock status Observer: ");
		window.setLockStatus("Open");
		System.out.println("Call window lock Status Observer Again");
		window.setLockStatus("Closed");
		
		
		WindowType sliding = new SlidingWindow();
		System.out.println("Check window Type");
		sliding.windowType();
		
		WindowType picture  = new WindowFilmDecorator(new PictureWindow());
		System.out.println("Check window Type Again");
		picture.windowType();
	}
}