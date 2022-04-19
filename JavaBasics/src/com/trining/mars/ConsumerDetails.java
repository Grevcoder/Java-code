package com.trining.mars;

public class ConsumerDetails {
	private int consumerNumber;
	private String consumerName;
	private int units;
	
	public ConsumerDetails(int consumerNumber,String consumerName,int units) {
		super();
		this.consumerNumber =consumerNumber;
		this.consumerName=consumerName;
		this.units = units;

		// TODO Auto-generated constructor stub
	}
	public int getConsumerNumber() {
		return consumerNumber;
	}
	public void setConsumerNumber(int consumerNumber) {
		this.consumerNumber = consumerNumber;
	}
	public String getConsumerName() {
		return consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	
	
	

}
