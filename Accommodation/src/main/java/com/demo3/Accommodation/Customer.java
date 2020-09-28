package com.demo3.Accommodation;

import javax.xml.bind.annotation.XmlRootElement;

//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

@XmlRootElement
public class Customer  {
	/*@Id
	@GeneratedValue(strategy=GenerationType.AUTO)*/
	private Long customer_id;
    
    public String name;
	public String email;
	
	
	public Customer() {
		this.name="";
		this.email="";
	}
	
	public void setCustomer_id(Long  customer_id) {
		this.customer_id = customer_id;
	}
	public Customer(String full_Name, String e_mail) {
		this.name=full_Name;
		this.email=e_mail;
	}
	
	public Long getCustomer_id() {
		return customer_id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	

}
