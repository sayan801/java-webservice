/**
 * 
 */
package com.hms.controller;



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

	@RequestMapping(value="/addOrUpdateDoctor", method = RequestMethod.POST ,headers="Accept=application/json,application/xml")
	public  @ResponseBody Response addDoctor(@RequestBody DoctorInfo doctorInfo){
	System.out.println("inside addOrUpdateDoctor method ");
		Response response=null;
		try {
			
			response = providerService.addDoctor(doctorInfo);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return response;
	}
	
	
	@RequestMapping(value="/deleteDoctor", method = RequestMethod.POST ,headers="Accept=application/json,application/xml")
	public  @ResponseBody Response deleteDoctor(@RequestBody DoctorInfo doctorInfo){
	System.out.println("inside deleteDoctor method ");
		Response response=null;
		try {
			
			response = providerService.deleteDoctor(doctorInfo);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return response;
	}
	

	@RequestMapping(value = "/findDoctorByAttributes" , method = RequestMethod.POST)
	public @ResponseBody Response findPatientByAttributes(@RequestBody DoctorInfo doctorInfo){
	
		Response response=null;
		try {
			
			response = providerService.getDoctorsByAttributes(doctorInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

}
