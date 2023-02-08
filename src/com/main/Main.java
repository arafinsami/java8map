package com.main;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Map<String, List<?>> collect = MapUtils.getMap(EmployeeService.getAllEmployee(), "lists");

		List<Employee> employees = MapUtils.cast(collect.values().stream()
				.flatMap(List::stream)
				.collect(Collectors.toList()));

		employees.forEach(System.out::println);
	}

}
