import java.util.Scanner;

public abstract class Data {

	String[][] students;
	String st;
	Teachers te;
	
	public Data() {
		
	}
	
	public Data(String st) {
		this.st = st;
	}

		
	public abstract void getStudent();
	
	public abstract void setTest();
	
	public abstract boolean getTest();
	
	public abstract int getID();
	
	public abstract char setFinish();
	
}
