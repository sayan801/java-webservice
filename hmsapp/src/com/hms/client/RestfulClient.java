package com.hms.client;


import javax.ws.rs.core.MediaType;

import org.apache.log4j.chainsaw.Main;

import com.hms.model.DoctorInfo;
import com.hms.model.Response;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class RestfulClient {
	
	public void invokeClient(){
		
		DoctorInfo doc= new DoctorInfo();
		doc.setIddoctors(300);
		doc.setAddress("chandra mridha");
		doc.setContactNumber("9611125680");
		doc.setName("Govind Reddy");
		try{
		Client client = Client.create();
		WebResource webResource = client.resource("http://128.199.255.162:8080/hmsapp/hms/findDoctorByID");
		ClientResponse response = webResource.accept(MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON).post(ClientResponse.class, doc);
		
		DoctorInfo  doc1 = response.getEntity(DoctorInfo.class);
		
		System.out.println("Name" + doc1.getName());
			
}catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
			
	}


	
	public static void main(String[] args) {
		RestfulClient client= new RestfulClient();
		try {
			client.addOrUpdateDoctor();
			client.findDoctorByID();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}



	private void addOrUpdateDoctor() {

		
		DoctorInfo doc= new DoctorInfo();
		//doc.setIddoctors(300);
		doc.setAddress("Govind Address");
		doc.setContactNumber("9611125680");
		doc.setName("Govind Reddy");
		try{
		Client client = Client.create();
		WebResource webResource = client.resource("http://128.199.255.162:8080/hmsapp/hms/addOrUpdateDoctor");
		ClientResponse response = webResource.accept(MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON).post(ClientResponse.class, doc);
		
			Response serviceResponse = response.getEntity(Response.class);
			if(serviceResponse != null){
				
				System.out.println(serviceResponse.getStatus());
		
		}
}catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
			
	
		
	}



	private void findDoctorByID() {
		
		DoctorInfo doc= new DoctorInfo();
		doc.setIddoctors(300);
		doc.setAddress("Govind Address");
		doc.setContactNumber("9611125680");
		doc.setName("Govind Reddy");
		try{
		Client client = Client.create();
		WebResource webResource = client.resource("http://128.199.255.162:8080/hmsapp/hms/findDoctorByID");
		ClientResponse response = webResource.accept(MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON).post(ClientResponse.class, doc);
		
		DoctorInfo  doc1 = response.getEntity(DoctorInfo.class);
		
		System.out.println("Name" + doc1.getName());
			/*Response serviceResponse = response.getEntity(Response.class);
			if(serviceResponse != null){
				
				System.out.println(serviceResponse.getDoctorInfoList().size());
		
		}*/
}catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
			
	}
	}
