/**
 * 
 */
package com.hms.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

/**
 * @author govind
 *
 */
@XmlRootElement
@Component
public class Response implements Serializable{
	
	private String code;
	private String status;
	
	private List<PatientInfo> patientInfoList = new ArrayList<PatientInfo>();
	private List<DoctorInfo> doctorInfoList = new ArrayList<DoctorInfo>();
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<PatientInfo> getPatientInfoList() {
		return patientInfoList;
	}
	public void setPatientInfoList(List<PatientInfo> patientInfoList) {
		this.patientInfoList = patientInfoList;
	}
	public List<DoctorInfo> getDoctorInfoList() {
		return doctorInfoList;
	}
	public void setDoctorInfoList(List<DoctorInfo> doctorInfoList) {
		this.doctorInfoList = doctorInfoList;
	}
	

}
