package com.codegnan.oopprogramming;

public class simpleinterest {
	private double principle;
	private double rate;
	private int time;
	
	public simpleinterest(double principle, double rate, int time) {
		super();
		this.principle = principle;
		this.rate = rate;
		this.time = time;
	}

	public double calculate() {
		double interest=(principle*time*rate)/100;
		return interest;
	}
	public double getPrinciple() {
		return principle;
	}


	public void setPrinciple(double principle) {
		this.principle = principle;
	}


	public double getRate() {
		return rate;
	}


	public void setRate(double rate) {
		this.rate = rate;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	public static void main(String[] args) {
		
		simpleinterest si=new simpleinterest(1000,5,2);
		double interest=si.calculate();
		System.out.println("si is: "+interest);
		
		si.setPrinciple(1500);
		interest=si.calculate();
		System.out.println("si is: "+interest);
	}

}
