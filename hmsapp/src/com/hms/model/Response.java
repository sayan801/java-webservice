/**
 * 
 */
package com.hms.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

/**
 * @author govind
 *
 */
@XmlRootElement
@Component
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Response implements Serializable{
	
	public Response(){
		
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
