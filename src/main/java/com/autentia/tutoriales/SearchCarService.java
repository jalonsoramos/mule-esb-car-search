package com.autentia.tutoriales;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;

@WebService(serviceName="searchCarService", endpointInterface="com.autentia.tutoriales.SearchCar")
public class SearchCarService implements SearchCar, Initialisable {
	
	final Map<Long, Car> cars = new HashMap<Long, Car>();
	
	@Override
	public void initialise() throws InitialisationException {
		cars.put(1L, new Car(1L, "Renault", "Megane", 18500D));
		cars.put(2L, new Car(2L, "Ford", "Focus", 17500D));
		cars.put(3L, new Car(3L, "Alfa Romeo", "159", 24000D));
		cars.put(4L, new Car(4L, "BMW", "Serie 1", 38900D));
		cars.put(5L, new Car(5L, "Volkswagen", "Golf", 24200D));
	}

	@Override
	public Car search(Long id, String customerMail) {
		final Car car = cars.get(id);
		car.setCustomerMail(customerMail);
        return car;
    }
}