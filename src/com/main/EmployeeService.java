package com.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {

	public static Map<String, List<?>> getAllEmployee() {
		Employee e1 = new Employee(1, "Sami");
		Employee e2 = new Employee(2, "Arafin");
		Employee e3 = new Employee(3, "Erha");
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		Map<String, List<?>> employeeMap = new HashMap<String, List<?>>();
		employeeMap.put("lists", employees);
		return employeeMap;
	}
}
