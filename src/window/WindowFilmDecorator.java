package window;

public class WindowFilmDecorator extends WindowTypeDecorator{
 public WindowFilmDecorator (WindowType windowTypeDecorator) {
	 super(windowTypeDecorator);
 }
 @Override
 public void windowType() {
	 windowDecorator.windowType();
	 setWindowFilmTypeTinted(windowDecorator);
 }
 private void setWindowFilmTypeTinted(WindowType windowTypeDecorator) {
	 System.out.println("Window Film Type: Tinted");
 }
}

