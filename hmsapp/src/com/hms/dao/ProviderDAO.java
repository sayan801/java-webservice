package com.hms.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hms.entity.Doctor;
import com.hms.model.Response;
/**
 * @author govind
 *
 */
@Component
public interface ProviderDAO {

	
public	 Response addDoctor(Doctor doc);

public	 List<Doctor>  getDoctorsByAttributes(Doctor doc);

}
