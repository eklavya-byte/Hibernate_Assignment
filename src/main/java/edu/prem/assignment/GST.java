package edu.prem.assignment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GST {
	
	@Id
	private int id;
	private String gstNumber;
	private String status;
	public GST() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GST(int id, String gstNumber, String status) {
		super();
		this.id = id;
		this.gstNumber = gstNumber;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "GST [id=" + id + ", gstNumber=" + gstNumber + ", status=" + status + "]";
	}
	
	
}
