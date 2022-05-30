package org.ZohoSchoolGraduateTraining;

import java.util.ArrayList;

public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<EmployeeData> employee = new ArrayList<>();

		EmployeeData employee1 = new EmployeeData();
		employee1.setEmpID(105);
		employee1.setName("Alagappan");
		employee1.setAge(22);

		EmployeeData employee2 = new EmployeeData();
		employee2.setEmpID(104);
		employee2.setName("Ramesh");
		employee2.setAge(22);
		EmployeeData employee3 = new EmployeeData();
		employee3.setEmpID(106);
		employee3.setName("Suresh");
		employee3.setAge(22);
		employee.add(employee1);
		employee.add(employee2);
		employee.add(employee3);
		for (EmployeeData details : employee) {
			if (details.getEmpID() == 104) {
				System.out.println("The ID of the employee " + (details.getEmpID()));
				System.out.println("The name of the employee " + (details.getName()));
				System.out.println("The age of the employee " + (details.getAge()));
			}
			

	}
	}
}
