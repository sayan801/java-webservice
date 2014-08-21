package com.hms.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@XmlRootElement (name = "patientInfo")
@Component
public class PatientInfo implements Serializable{

	

	private String address;

	private String contactNumber;

	private String govtPhotoId;

	private String name;

	private String photoPath;

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

	public String getGovtPhotoId() {
		return govtPhotoId;
	}

	public void setGovtPhotoId(String govtPhotoId) {
		this.govtPhotoId = govtPhotoId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

}
