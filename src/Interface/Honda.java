package Interface;

public class Honda implements Audi {

	@Override
	public void close() {
		
		System.out.println("car doors are closed");
		
	}

	@Override
	public void findElement() {
		
		System.out.println("apply clutch");
		
	}

	@Override
	public void get() {
		
		System.out.println("accelerate car");
		
	}

	@Override
	public void quit() {
		
		System.out.println("car stopped");
		
	}
	


}
