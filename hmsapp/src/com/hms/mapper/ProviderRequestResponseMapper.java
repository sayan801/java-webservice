/**
 * 
 */
package com.hms.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hms.entity.Doctor;
import com.hms.model.DoctorInfo;

/**
 * @author govind
 *
 */
@Component
public class ProviderRequestResponseMapper {
	
	public Doctor getDoctorEntity(DoctorInfo doctorInfo){
			Doctor doc =new Doctor();
			doc.setAddress(doctorInfo.getAddress());
			doc.setContactNumber(doctorInfo.getContactNumber());
			doc.setDoctorRegNumber(doctorInfo.getDoctorRegNumber());
			doc.setDoctorSpecialty(doctorInfo.getDoctorSpecialty());
			doc.setName(doctorInfo.getName());
			return doc;
			
	}

	public List<DoctorInfo> getDoctorInfoList(List<Doctor>  doctorList) {
		// TODO Auto-generated method stub
		
		List<DoctorInfo> doctorInfoList=  new ArrayList<DoctorInfo>();
		
		for (int i = 0; i < doctorList.size(); i++) {
			Doctor doc=	doctorList.get(i);
			
			doctorInfoList.add(getDoctorInfoFromEntity(doc));
			
		}
		return doctorInfoList;
		
	}

	public DoctorInfo getDoctorInfoFromEntity(Doctor doc) {
		DoctorInfo doctorInfo = new DoctorInfo();
		doctorInfo.setAddress(doc.getAddress());
		doctorInfo.setContactNumber(doc.getContactNumber());
		doctorInfo.setDoctorRegNumber(doc.getDoctorRegNumber());
		doctorInfo.setDoctorSpecialty(doc.getDoctorSpecialty());
		doctorInfo.setName(doc.getName());
		return doctorInfo;
	}

}
