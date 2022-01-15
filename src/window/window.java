package window;

import java.util.ArrayList;
import java.util.List;


public class window {

	private List<Observer> observers = new ArrayList<Observer>();
	private String lockStatus;
	
	public String getLockStatus() {
		return lockStatus;
	}
	public void setLockStatus(String lockStatus) {
		this.lockStatus = lockStatus;
		notifyAllObservers();
	}
	
	public void attach (Observer observer) {
		observers.add(observer);
	}
	public void notifyAllObservers() {
		for(Observer observer :observers ) {
			observer.update();
		}
		
	}
	public void open () {
		System.out.println("open window");
	}
	public void close () {
		System.out.println("close window");
	}
}
