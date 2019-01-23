package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adress")
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "addressline1")
	private String addressline1;

	@Column(name = "addressline2")
	private String addressline2;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "zipcode")
	private double zipcode;

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getZipcode() {
		return zipcode;
	}

	public void setZipcode(double zipcode) {
		this.zipcode = zipcode;
	}

	public String toString() {
		return "AddressEntity [id=" + id + ", addressline1=" + addressline1 + ", addressline2=" + addressline2
				+ ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}

}
