/**
 * 
 */
package com.hms.service;

import org.springframework.stereotype.Component;

import com.hms.model.DoctorInfo;
import com.hms.model.Response;
/**
 * @author govind
 *
 */
@Component
public interface ProviderService {
	
public	 Response addDoctor(DoctorInfo doctorInfo);

public	 Response getDoctorsByAttributes(DoctorInfo doctorInfo);

}
