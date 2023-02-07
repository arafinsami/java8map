package com.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {

	public Map<String, List<Employee>> getAllEmployee() {
		Employee e1 = new Employee(1, "Sami");
		Employee e2 = new Employee(1, "Arafin");
		Employee e3 = new Employee(1, "Erha");
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		Map<String, List<Employee>> employeeMap = new HashMap<String, List<Employee>>();
		employeeMap.put("lists", employees);
		return employeeMap;
	}
}
