package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();

		Map<String, List<Employee>> collect = employeeService.getAllEmployee().entrySet().stream()
				.filter(x -> x.getKey().equals("lists"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		List<List<Employee>> employees = collect.values().stream().collect(Collectors.toList());
		
		List<Employee> lists = new ArrayList<Employee>();
		
		employees.stream().forEach(e -> lists.addAll(e));
		lists.forEach(l-> {
			System.out.println(l);
		});
	}

}
