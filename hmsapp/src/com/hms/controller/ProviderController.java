/**
 * 
 */
package com.hms.controller;



import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hms.model.DoctorInfo;
import com.hms.model.Response;
import com.hms.service.ProviderService;

/**
 * @author govind
 *
 */

@RestController
@RequestMapping(value = "/hms")
public class ProviderController {
	
	@Autowired
	ProviderService providerService;

	@RequestMapping(value="/addDoctor", method = RequestMethod.POST ,headers="Accept=application/xml")
	public  @ResponseBody Response addDoctor(@RequestBody DoctorInfo doctorInfo){
	
		Response response=null;
		try {
			
			response = providerService.addDoctor(doctorInfo);
		
		} catch (Exception e) {
			
			
		}
		return response;
	}
	

	@RequestMapping(value = "/findDoctorByAttributes" , method = RequestMethod.POST)
	public @ResponseBody Response findPatientByAttributes(@RequestBody DoctorInfo doctorInfo){
	
		Response response=null;
		try {
			
			response = providerService.getDoctorsByAttributes(doctorInfo);
		} catch (Exception e) {
			
		}
		return response;
	}

}
