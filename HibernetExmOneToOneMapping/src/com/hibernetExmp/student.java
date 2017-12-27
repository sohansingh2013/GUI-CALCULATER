/**
 * 
 */
package com.hibernetExmp;

/**
 * @author Sonu Singh
 *
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//import javax.persistence.Transient;

import java.util.Date;

import javax.persistence.Column;

@Entity
@Table(name = "STUDENT1")
public class student {

	@Id
	
	
	@GeneratedValue
    private int sid;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	//@Transient
	@Column(name = "First_name", nullable = false)
	private String fname;
	
	@Column(name = "Middle_name")
	private String mname;
	
	@Column(name = "Last_name")
	private String lname;
	
	@Column(name = "Full_addres", nullable = false)
	private String addres;
	
	@Column(name = "Phone_number", nullable = false)
	private long phone;
	
	@Temporal(TemporalType.DATE)
	private Date birthdate;

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public int getRollno() {
		return sid;
	}

	public void setRollno(int rollno) {
		this.sid = rollno;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}
