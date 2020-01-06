package assignment2;


	import org.springframework.stereotype.Service;

	@Service

public interface EmployeeService {

		Integer baseSalary = 1000;
			
		public Integer calculateSalary();

	}

}
