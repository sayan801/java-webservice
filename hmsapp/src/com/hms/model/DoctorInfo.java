package com.hms.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;



@XmlRootElement (name = "DoctorInfo")
@Component
public class DoctorInfo implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String address;
	
	private Integer iddoctors;

	private String contactNumber;

	
	private String doctorRegNumber;


	private String doctorSpecialty;
	
	private String name;


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getDoctorRegNumber() {
		return doctorRegNumber;
	}


	public void setDoctorRegNumber(String doctorRegNumber) {
		this.doctorRegNumber = doctorRegNumber;
	}


	public String getDoctorSpecialty() {
		return doctorSpecialty;
	}


	public void setDoctorSpecialty(String doctorSpecialty) {
		this.doctorSpecialty = doctorSpecialty;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getIddoctors() {
		return iddoctors;
	}


	public void setIddoctors(Integer iddoctors) {
		this.iddoctors = iddoctors;
	}

}
