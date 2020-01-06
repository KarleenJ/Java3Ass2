package assignment2;



public class ManagerService implements EmployeeService {
	
	public Integer calculateSalary() {
			Integer managerSalary = baseSalary + 500;
			return managerSalary;
	}


}
