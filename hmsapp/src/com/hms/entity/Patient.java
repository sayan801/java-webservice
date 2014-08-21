package com.hms.entity;


import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the patients database table.
 * 
 */
@Entity
@Table(name="patients")
public class Patient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PATIENTS_IDPATIENTS_GENERATOR", sequenceName="SEQ_PATIENTS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PATIENTS_IDPATIENTS_GENERATOR")
	private Integer idpatients;

	private String address;

	@Column(name="contact_number")
	private String contactNumber;

	@Column(name="govt_photo_id")
	private String govtPhotoId;

	private String name;

	@Column(name="photo_path")
	private String photoPath;

    public Patient() {
    }

	public Integer getIdpatients() {
		return this.idpatients;
	}

	public void setIdpatients(Integer idpatients) {
		this.idpatients = idpatients;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getGovtPhotoId() {
		return this.govtPhotoId;
	}

	public void setGovtPhotoId(String govtPhotoId) {
		this.govtPhotoId = govtPhotoId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhotoPath() {
		return this.photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

}