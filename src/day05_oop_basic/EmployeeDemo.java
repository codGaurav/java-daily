package day05_oop_basic;

class Employee {
	private int empId;
	private double salary;

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		}
	}

	public int getEmpId() {
		return empId;
	}

	public double getSalary() {
		return salary;
	}

	public double calculateYearlySalary() {
		return salary * 12;
	}
}

public class EmployeeDemo {
	public static void main(String[] args) {
		
	Employee emp = new Employee();
	emp.setEmpId(11);
	emp.setSalary(100000);
	
	System.out.println("Yearly Salary: "+ emp.calculateYearlySalary());
	
	}	
}
