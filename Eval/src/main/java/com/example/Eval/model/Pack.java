package com.example.Eval.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="items")
public class Pack {

	@Id
	int package_id;
	
	//@NotNull(message = "Source place may not be null")
	@Column
	String source_place;
	
	//@NotNull
	@Column
	double basic_fare;
	
	//@NotNull(message = "Destination place may not be null")
	@Column
	String destination_place;

	public Pack() {
		// TODO Auto-generated constructor stub
	}

	public int getPackage_id() {
		return package_id;
	}

	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}

	public String getSource_place() {
		return source_place;
	}

	public void setSource_place(String source_place) {
		this.source_place = source_place;
	}

	public double getBasic_fare() {
		return basic_fare;
	}

	public void setBasic_fare(double basic_fare) {
		this.basic_fare = basic_fare;
	}

	public String getDestination_place() {
		return destination_place;
	}

	public void setDestination_place(String destination_place) {
		this.destination_place = destination_place;
	}

	public Pack(int package_id, String source_place, double basic_fare, String destination_place) {
		super();
		this.package_id = package_id;
		this.source_place = source_place;
		this.basic_fare = basic_fare;
		this.destination_place = destination_place;
	}
	
	
	

	
	
	
	
	
}
