package com.hms.dao.Impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hms.dao.ProviderDAO;
import com.hms.dao.abs.AbstractHmsDAO;
import com.hms.entity.Doctor;
import com.hms.model.Response;


@Repository
@Transactional
public class ProviderDAOImpl extends AbstractHmsDAO<Doctor, Integer> implements ProviderDAO {

/*
	@Autowired
    private SessionFactory sessionFactory;
	*/
	
	
	 public ProviderDAOImpl(){
	      setClazz(Doctor.class );
	   }
	
	Session session = null;
	

	@Override
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED)
	public Response addDoctor(Doctor doc) {
		
		Response response =new Response();
		try {
			
			saveOrUpdate(doc);
			
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
			
			delete(doc);
			
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
							
			session= getCurrentSession();
			Criteria c = session.createCriteria(Doctor.class);		
			if(!isNullOrEmpty(doc.getDoctorRegNumber()))
				c.add(Restrictions.eq("doctorRegNumber", doc.getDoctorRegNumber()));
				if(!isNullOrEmpty(doc.getContactNumber()))
				c.add(Restrictions.eq("contactNumber", doc.getContactNumber()));
				if(!isNullOrEmpty(doc.getDoctorSpecialty()))
				c.add(Restrictions.eq("doctorSpecialty", doc.getDoctorSpecialty()));
				if(!isNullOrEmpty(doc.getName()))
				c.add(Restrictions.eq("name", doc.getName()));			
				
			doctorList = (List<Doctor>)c.list();
			
		} catch (Exception e) {
			
		}
		return doctorList;
	}
	

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly=true,propagation=Propagation.REQUIRED)
	public Doctor getDoctorByID(Doctor doc) {
	
		Doctor docEntity=null;
		//List<Doctor> doctorList = null;
		
		try {
			
			docEntity=	findById(doc.getIddoctors());	
			
			System.out.println("inside getDoctorByID in DAO impl " + docEntity.getName());
		} catch (Exception e) {
			
		}
		return docEntity;
	}
	


public static boolean isNullOrEmpty(Object str) {
	return (str == null || str.toString().trim().isEmpty()) ? true : false;
}


@SuppressWarnings("unchecked")
@Override
@Transactional(readOnly=true,propagation=Propagation.REQUIRED)
public List<Doctor> getDoctorsByAttribute(Doctor doc) {
	// TODO Auto-generated method stub
	return null;
}

}
