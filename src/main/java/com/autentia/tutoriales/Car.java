package com.autentia.tutoriales;

public class Car  {
	
    private Long id;
    
    private String model;
    
    private String manufacturer;
   
    private Double price;

    private String customerMail;
    
    public Car() {
    	//required default constructor
    }
    
    public Car(Long id, String manufacturer, String model, Double price) {
    	this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }
    
    public Long getId() {
        return id;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public String getModel() {
        return model;
    }
    
    public Double getPrice() {
        return price;
    }

    public String getCustomerMail() {
        return customerMail;
    }
    
    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		final Car other = (Car) obj;

		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id)) {
			return false;
		}
		
		return true;
	}
    
    
}
