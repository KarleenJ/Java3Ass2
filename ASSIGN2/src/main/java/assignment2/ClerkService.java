package assignment2;

public class ClerkService implements EmployeeService{

	public Integer calculateSalary() {
		Integer clerkSalary = baseSalary + 150;
		return clerkSalary;
	}

}
