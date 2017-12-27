/**
 * 
 */
package com.hibernetExmp;

/**
 * @author Sonu Singh
 *
 */
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student st = new student();
		
		st.setFname("sohan");
		st.setMname("kumar");
		st.setLname("singh");
		st.setAddres("bihar");
		st.setPhone(89516017);
		st.setBirthdate(new Date());
		
		studentdetails sd =  new studentdetails();
		
		sd.setClassname("seven");
		sd.setFathername("ram");
		sd.setMothername("sita");
		sd.setMarks(500);
		sd.setStudent(st);

		SessionFactory SessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = SessionFactory.openSession();
		session.beginTransaction();
		
// I don't save student object but still it will save in database
		//that the magic of One to One Mapping.
		//if you write the code like //session.save(st); 
		//only one record is inserted because this is one to one mapping not by directional mapping see next example for bidirectional
		//session.save(st);
		session.save(sd);
		//session.save(st);  ---this line executed parent and child data is not present you can see database
		session.getTransaction().commit();
		session.close();
		SessionFactory.close();

	}

}
