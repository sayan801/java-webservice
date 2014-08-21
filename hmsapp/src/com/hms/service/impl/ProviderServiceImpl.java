/**
 * 
 */
package com.hms.service.impl;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hms.dao.ProviderDAO;
import com.hms.entity.Doctor;
import com.hms.mapper.ProviderRequestResponseMapper;
import com.hms.model.DoctorInfo;
import com.hms.model.Response;
import com.hms.service.ProviderService;

/**
 * @author govind
 *
 */
@Repository
public class ProviderServiceImpl implements ProviderService {

	@Autowired
	ProviderDAO providerDAO;
	@Autowired
	
	ProviderRequestResponseMapper providerRequestResponseMapper;
	
	/* (non-Javadoc)
	 * @see com.hms.service.ProviderService#addDoctor(com.hms.model.DoctorInfo)
	 */
	@Override
	public Response addDoctor(DoctorInfo doctorInfo) {
		// TODO Auto-generated method stub
		return providerDAO.addDoctor(providerRequestResponseMapper.getDoctorEntity(doctorInfo));
	}

	/* (non-Javadoc)
	 * @see com.hms.service.ProviderService#getDoctorsByAttributes(com.hms.model.DoctorInfo)
	 */
	@Override
	public Response getDoctorsByAttributes(DoctorInfo doctorInfo) {
		// TODO Auto-generated method stub
		Response response= new Response();
		List<Doctor>  doctorList= providerDAO.getDoctorsByAttributes(providerRequestResponseMapper.getDoctorEntity(doctorInfo));
		if(doctorList.size()>0){
			List<DoctorInfo> doctorInfoList=	providerRequestResponseMapper.getDoctorInfoList(doctorList);
			response.setDoctorInfoList(doctorInfoList);
		}
		
		return response;
	}

}
