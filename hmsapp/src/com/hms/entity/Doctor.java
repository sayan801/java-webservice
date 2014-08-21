package com.hms.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the doctors database table.
 * 
 */
@Entity
@Table(name="doctors")
public class Doctor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DOCTORS_IDDOCTORS_GENERATOR", sequenceName="SEQ_DOCTORS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DOCTORS_IDDOCTORS_GENERATOR")
	private Integer iddoctors;

	private String address;

	@Column(name="contact_number")
	private String contactNumber;

	@Column(name="doctor_reg_number")
	private String doctorRegNumber;

	@Column(name="doctor_specialty")
	private String doctorSpecialty;

	private String name;

    public Doctor() {
    }

	public Integer getIddoctors() {
		return this.iddoctors;
	}

	public void setIddoctors(Integer iddoctors) {
		this.iddoctors = iddoctors;
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

	public String getDoctorRegNumber() {
		return this.doctorRegNumber;
	}

	public void setDoctorRegNumber(String doctorRegNumber) {
		this.doctorRegNumber = doctorRegNumber;
	}

	public String getDoctorSpecialty() {
		return this.doctorSpecialty;
	}

	public void setDoctorSpecialty(String doctorSpecialty) {
		this.doctorSpecialty = doctorSpecialty;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}