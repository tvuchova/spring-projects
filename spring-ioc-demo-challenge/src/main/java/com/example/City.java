/*
 * tvuchova
 *
 * Define class city with name,which I use to demostrate Inversion of control
 * 
 */
package com.example;

public class City {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City(String name) {
		super();
		this.name = name;
	}
	
	public void cityName() {
		System.out.format("City name is : %s",getName());
	}

}

