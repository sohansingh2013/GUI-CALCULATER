/**
 * 
 */
package HibernateManytoManyMappingDemo;





import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * @author Sonu Singh
 *
 */
@Entity
@Table(name = "STUDENTCERTIFICATION")
public class StudentCertification {
	
	@Id
	@GeneratedValue
    private int scid;
	
	
	private String scname;


	public int getScid() {
		return scid;
	}


	public void setScid(int scid) {
		this.scid = scid;
	}


	public String getScname() {
		return scname;
	}


	public void setScname(String scname) {
		this.scname = scname;
	}



	
	
	/*//@OneToMany(cascade = CascadeType.ALL , mappedBy="studentadress" )
	//private Set<Student> Student=new HashSet<Student>(0);
	//in case if you are delete , mappedBy="studentadress" then hibernet by default generate one more
	// table like that studentaddress1_student3 that is porblem if you are MappedBypropertyconcept then you should put-- , mappedBy="studentadress"
	// then solved this problem. you can try and delete table after that see magic .
*/


		
	}

	
	
	
	


