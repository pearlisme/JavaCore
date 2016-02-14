package main;

public class FirstDemoImpl extends Firstdemo {

	@Override
	public void run() {
	System.out.println("inside "+this.getClass());
	for(int i=0;i<10;i++)
		System.out.println("value of "+ i);
		
	}

	
	

}
