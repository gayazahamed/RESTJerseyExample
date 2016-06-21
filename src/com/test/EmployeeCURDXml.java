package com.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("/employeecurdxml")
public class EmployeeCURDXml {
	@GET
	@Produces("application/xml")
	public String getEmployeeXml() {
 
        Employee emp = new Employee();
        emp.setId(1);
        emp.setAge(25);
        emp.setName("Gayaz");
        emp.setGender("Male");
        emp.setRole("Developer");
        emp.setPassword("sensitive");

        JAXBExample.jaxbObjectToXMLString(emp);
 
		return JAXBExample.jaxbObjectToXMLString(emp);
	}
	
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String getEmployeeXml(@PathParam("c") Double c) {
		Employee emp = new Employee();
        emp.setId(1);
        emp.setAge(25);
        emp.setName("Gayaz");
        emp.setGender("Male");
        emp.setRole("Developer");
        emp.setPassword("sensitive");

        JAXBExample.jaxbObjectToXMLString(emp);
 
		return JAXBExample.jaxbObjectToXMLString(emp);
	}
	
}



  