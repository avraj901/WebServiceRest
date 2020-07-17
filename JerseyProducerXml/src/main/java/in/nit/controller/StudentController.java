package in.nit.controller;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import in.nit.modal.Student;

@Path("/student")
public class StudentController {
	@GET
	@Path("one")
	@Produces("application/xml")
	public Student getStudentDeatils() {

		Student student = new Student();
		student.setStdentId(1);
		student.setStudentName("avanish");
		student.setStudentFee(2000.9);
		return student;
	}
	@GET
	@Path("two")
	@Produces("application/xml")
	public List<Student> getListStudent(){
		List<Student> listStudent=Arrays.asList(
				new Student(2, "ankur", 330.5),
				new Student(3, "ramu", 223.4),
				new Student(4, "aashish", 345.3)
				);
		return listStudent;
	}
}
