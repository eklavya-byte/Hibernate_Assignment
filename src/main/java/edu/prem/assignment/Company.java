package edu.prem.assignment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Company {
	@Id
	private int id;
	private String name;
	private long phone;
	private String email;
	
	@OneToOne
	private GST gst;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(int id, String name, long phone, String email, GST gst) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gst = gst;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public GST getGst() {
		return gst;
	}

	public void setGst(GST gst) {
		this.gst = gst;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", gst=" + gst + "]";
	}
	
	

}
