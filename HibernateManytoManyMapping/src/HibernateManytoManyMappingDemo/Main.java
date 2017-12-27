/**
 * 
 */
package HibernateManytoManyMappingDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;



/**
 * @author Sonu Singh
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		StudentCertification studentcertification1 = new StudentCertification();
		studentcertification1.setScname("java");
		
		StudentCertification studentcertification2 = new StudentCertification();
		studentcertification2.setScname("j2ee");
		
		Student Student1 = new Student();
		Student1.setSname("sohan");
		(Student1.getStudentcertification()).add(studentcertification1);
		
		Student Student2 = new Student();
		Student2.setSname("sohan");
		(Student2.getStudentcertification()).add(studentcertification2);
		
		//(studentaddress.getStudent()).add(Student1);
		//(studentaddress.getStudent()).add(Student2);
		
		SessionFactory SessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = SessionFactory.openSession();
		session.beginTransaction();
		
		session.save(studentcertification1);
		session.save(studentcertification2);
		
		session.getTransaction().commit();
		session.close();
		SessionFactory.close();
		
	}

}
