package in.nit.modal;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Student {

	private Integer stdentId;
	private String studentName;
	private Double studentFee;
	public Integer getStdentId() {
		return stdentId;
	}
	public void setStdentId(Integer stdentId) {
		this.stdentId = stdentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Double getStudentFee() {
		return studentFee;
	}
	public void setStudentFee(Double studentFee) {
		this.studentFee = studentFee;
	}
	@Override
	public String toString() {
		return "Student [stdentId=" + stdentId + ", studentName=" + studentName + ", studentFee=" + studentFee + "]";
	}
	public Student(Integer stdentId, String studentName, Double studentFee) {
		super();
		this.stdentId = stdentId;
		this.studentName = studentName;
		this.studentFee = studentFee;
	}
	public Student() {
		super();
	}
	
	
	
}
