package com.autentia.tutoriales;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface SearchCar {
	
    @WebResult(name="id") 
    Car search(@WebParam(name="id") Long id, 
    		   @WebParam(name="mail") String customer);
}
