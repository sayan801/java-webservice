package com.hms.dao.Impl;

import com.hms.dao.ProviderDAO;
import com.hms.entity.Doctor;
import com.hms.model.DoctorInfo;
import com.hms.model.Response;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProviderDAOImpl implements ProviderDAO {


	@Autowired
    private SessionFactory sessionFactory;
	
	
	
	Session session = null;
	

	@Override
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED)
	public Response addDoctor(Doctor doc) {
		
		Response response =new Response();
		try {
			session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(doc);
			
		} catch (Exception e) {
			
		}
		
		response.setCode("HMS001");
		response.setStatus("Successfully Added.");
		return response;
		
	}
	

	@Override
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED)
	public Response deleteDoctor(Doctor doc) {
		
		Response response =new Response();
		try {
			session = sessionFactory.getCurrentSession();
			session.delete(doc);
			session.flush();
		} catch (Exception e) {
			
		}
		
		response.setCode("HMS002");
		response.setStatus("Record deleted succesfully.");
		return response;
		
	}
	
	
/*
	@Override
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED)
	public Response updateDoctor(Doctor doc) {
		
		Response response =new Response();
		try {
			session = sessionFactory.getCurrentSession();
			
			Doctor docEntity = 
                    (Doctor)session.get(Doctor.class, doc.getIddoctors()); 
			
			session.saveOrUpdate(doc);
			
		} catch (Exception e) {
			
		}
		
		response.setCode("HMS002");
		response.setStatus("Successfully Updated.");
		return response;
		
	}
	*/
	
	

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly=true,propagation=Propagation.REQUIRED)
	public List<Doctor> getDoctorsByAttributes(Doctor doc) {
	
		
		List<Doctor> doctorList = null;
		
		try {
			session = sessionFactory.getCurrentSession();
			Criteria c = session.createCriteria(Doctor.class);		
			/*if(!isNullOrEmpty(doc.getContactNumber()))
				c.add(Restrictions.eq("name.firstname", doc.getContactNumber())));
				if(!isNullOrEmpty(doc.getContactNumber()))
				c.add(Restrictions.eq("name.lastname", lastName));
				if(!isNullOrEmpty(doc.getContactNumber()))
				c.add(Restrictions.eq("demographic.sex", gender));
				if(!isNullOrEmpty(doc.getContactNumber()))
				c.add(Restrictions.eq("master.dob", DateUtil.convertDateToSqlformat(dob)));
			*/
				
			doctorList = (List<Doctor>)c.list();
			
		} catch (Exception e) {
			
		}
		return doctorList;
	}
	
	


public static boolean isNullOrEmpty(Object str) {
	return (str == null || str.toString().trim().isEmpty()) ? true : false;
}

}
