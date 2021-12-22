package com.web.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public List<Employee> employeeData() {

		Employee employee0 = new Employee();
		employee0.setFirstName("Abhishek");
		employee0.setLastName("Sharma");
		employee0.setAge(29);
		Address address0 = new Address();
		address0.setLine1("aaaaaaaaaa");
		address0.setLine2("aaaaaaaaaa");
		address0.setCity("Harda");
		address0.setState("MP");
		address0.setPincode(461331);
		employee0.setAddress(address0);

		Employee employee1 = new Employee();
		employee1.setFirstName("Rahul");
		employee1.setLastName("Yadav");
		employee1.setAge(29);
		Address address1 = new Address();
		address1.setLine1("aaaaaaaaaa");
		address1.setLine2("aaaaaaaaaa");
		address1.setCity("Indore");
		address1.setState("MP");
		address1.setPincode(463156);
		employee1.setAddress(address1);

		Employee employee2 = new Employee();
		employee2.setFirstName("Kapil");
		employee2.setLastName("Sharma");
		employee2.setAge(50);
		Address address2 = new Address();
		address2.setLine1("aaaaaaaaaa");
		address2.setLine2("aaaaaaaaaa");
		address2.setCity("Pune");
		address2.setState("MH");
		address2.setPincode(462331);
		employee2.setAddress(address2);

		Employee employee3 = new Employee();
		employee3.setFirstName("Deepti");
		employee3.setLastName("Raguwanshi");
		employee3.setAge(28);
		Address address3 = new Address();
		address3.setLine1("aaaaaaaaaa");
		address3.setLine2("aaaaaaaaaa");
		address3.setCity("Pune");
		address3.setState("MH");
		address3.setPincode(463631);
		employee3.setAddress(address3);

		List<Employee> employees = Arrays.asList(employee0, employee1, employee2, employee3);

		return employees;

	}
}
