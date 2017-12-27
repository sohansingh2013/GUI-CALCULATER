/**
 * 
 */
package com.hibernetExmp;

/**
 * @author Sonu Singh
 *
 */
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "STUDENTDETAILS1")
public class studentdetails {
	@Id
	@GeneratedValue(generator = "newGenerator")
	@GenericGenerator(name= "newGenerator" , strategy = "foreign" , parameters = { @Parameter (value ="student" ,name ="property")})
    private int sid;
	
	@Column(name = "class_name")
	private String classname;
	
	@Column(name = "father_name")
	private String fathername;
	
	@Column(name = "mother_name")
	private String mothername;
	
	@Column(name = "total_marks")
	private int marks;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rollno")
	private student  student;

	
	public student getStudent() {
		return student;
	}

	public void setStudent(student student) {
		this.student = student;
	}

	public int getRollno() {
		return sid;
	}

	public void setRollno(int rollno) {
		this.sid = rollno;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	

}
