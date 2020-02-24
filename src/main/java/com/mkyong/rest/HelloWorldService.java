package com.mkyong.rest;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.io.IOException;
import java.util.List;

@Path("rest/employees")
public class HelloWorldService {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	EmployeeService employeeService;

	public HelloWorldService() {
		employeeService = new EmployeeService();

	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	@POST
	@Produces(MediaType.TEXT_HTML)
	//@Consumes(MediaType.APPLICATION_FORM_URLENCODED)

	public void createEmployees(@FormParam("Id") String Id,
								@FormParam("name") String name,
								@FormParam("designation") String designation) throws IOException {
		Employee employee = new Employee(Id, name, designation);
		employeeService.createEmployee(employee);

	}

	/*@POST
	@Produces("application/html")
	//@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Path("{employee}")

	public HelloWorldService getEmployees(@PathParam("employee") String id) {
		return new HelloWorldService(uriInfo, request, id);
	}
*/








 /*
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
	@POST
	@Produces("application/xml")
	@Path("/{Id}")

	public Employee getEmployeeDetails(@PathParam("Id")String Id)
	{

		Employee emp =new Employee(Id,"Singu","bangalore");

		return emp;
	}*/

}