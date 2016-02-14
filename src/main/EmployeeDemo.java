package main;

public class EmployeeDemo implements EmployeeInterface {

	
	public static void main(String[] args) {
		EmployeeDemo ed=new EmployeeDemo();
		ed.getEmpName();
		ed.getEmpName();
		
	}

	@Override
	public int getEmpId() {
    System.out.println("inside empid");
		return 0;
	}

	@Override
	public void getEmpName() {

		System.out.println("inside getempname");
		
	}

}
