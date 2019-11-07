package com.savitha.leetcode;

public class Laps {
    int model;
    int Ram;
    private String make;
	public int getModel() {
		return model;
	}
	public int getRam() {
		return Ram;
	}
	public String getMake() {
		return make;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public void setRam(int ram) {
		Ram = ram;
	}
	public void setMake(String make) {
		this.make = make;
	}
	@Override
	public String toString() {
		return "Laps [model=" + model + ", Ram=" + Ram + ", make=" + make + "]";
	}
	public Laps(int model, int ram, String make) {
		//super();
		this.model = model;
		this.Ram = ram;
		this.make = make;
	}
    
	
}
