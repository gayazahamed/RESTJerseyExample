package com.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

@Path("/employeecurdjson")
public class EmployeeCURDJson {
	@GET
	@Produces("application/json")
	public String getEmployeeXml() {

		Employee emp = new Employee();
		emp.setId(1);
		emp.setAge(25);
		emp.setName("Gayaz");
		emp.setGender("Male");
		emp.setRole("Developer");
		emp.setPassword("sensitive");

		List<Employee> listemp = new ArrayList<Employee>();
		listemp.add(emp);
		listemp.add(emp);
		listemp.add(emp);
		listemp.add(emp);
		return JsonConvert.convertToJson(listemp);
	}

	@Path("{c}")
	@GET
	@Produces("application/json")
	public String getEmployeeXml(@PathParam("c") Double c) {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setAge(25);
		emp.setName("Gayaz");
		emp.setGender("Male");
		emp.setRole("Developer");
		emp.setPassword("sensitive");

		return JsonConvert.convertToJson(emp);
	}

}
