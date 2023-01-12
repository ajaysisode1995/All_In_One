package stringPackages;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class Test {
		public static void main(String[] args) {
			List<Employee> asList = Arrays.asList(
					new Employee(111, "Ajay", "Sw", 27, 5000.00),
					new Employee(112, "Vinish", "QA", 30, 5500.00),
					new Employee(113, "Amaan", "Qa", 26, 6000.00),
					new Employee(114, "Praveen", "SW", 29, 7000.00)
					);
			asList.stream().filter(emp->{
				if (emp.getAge()>=28) {
					System.out.println(emp.getName()+"---"+emp.getDept());
				}
				return true;
			}).collect(Collectors.toList());
			
		}
}
