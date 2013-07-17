package com.prog;

class Employee  {
	private String name;

	Employee(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
	
	void setname(String name){
		this.name = name;
	}

}

public class PassByValue {
	
	public void swap1(Employee employee){
		employee.setname("PQR");
	}
	
	public void swap2(Employee employee){
		employee = null;
	}
	
	public void swap3(Employee employee){
		employee = new Employee("DEF");
	}
	
	public void swapInteger(int b){
		b = 7;
	}
	
	public static void main(String[] args){
		Employee employee1 = new Employee("ABC");
		PassByValue passByValue = new PassByValue();
		passByValue.swap1(employee1);
		System.out.println(employee1.getName());
		passByValue.swap2(employee1);
		System.out.println(employee1.getName());
		passByValue.swap3(employee1);
		System.out.println(employee1.getName());
		
		Employee employee3 = new Employee("emp3");
		Employee employee4 = new Employee("emp4");
		
		employee3 = employee4;
		System.out.println(employee3.getName());
		
		employee4.setname("xyz");
		System.out.println(employee3.getName());
		
		employee4 = null;
		System.out.println(employee3.getName());
		
		int a =3;
		passByValue.swapInteger(a);
		System.out.println(" Integer value after swapping a = " + a);
		
		
	}
}
