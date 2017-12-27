/**
 * 
 */
package HibernateManytoManyMappingDemo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



/**
 * @author Sonu Singh
 *
 */
@Entity
@Table(name = "STUDENT4")
public class Student {

	@Id
	@GeneratedValue
    private int sid;
	
	@Column(name = "sname")
	private String sname;

	@ManyToMany(cascade = CascadeType.ALL)
	private Set<StudentCertification>  studentcertification =new HashSet<StudentCertification>(0);
	
	

	public Set<StudentCertification> getStudentcertification() {
		return studentcertification;
	}

	public void setStudentcertification(Set<StudentCertification> studentcertification) {
		this.studentcertification = studentcertification;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
	

	
	
}
	
	

		
