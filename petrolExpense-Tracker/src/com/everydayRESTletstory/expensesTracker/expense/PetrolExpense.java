package com.everydayRESTletstory.expensesTracker.expense;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author shreyanshp
 *
 */
public class PetrolExpense implements Expense {

	private Long id;
	private boolean airCheck;
	private double price;
	private double amountINR;
	private double amountLtr;
	private double odometerReading;
	private long timeMS;
	private long logTime;
	private String brand;
	private String pumpAddress;
	private String modeOfTransection;
	private ConcurrentHashMap<String, Double> geoLocation;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the airCheck
	 */
	public boolean isAirCheck() {
		return airCheck;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the amountINR
	 */
	public double getAmountINR() {
		return amountINR;
	}

	/**
	 * @return the amountLtr
	 */
	public double getAmountLtr() {
		return amountLtr;
	}

	/**
	 * @return the odometerReading
	 */
	public double getOdometerReading() {
		return odometerReading;
	}

	/**
	 * @return the timeMS
	 */
	public long getTimeMS() {
		return timeMS;
	}

	/**
	 * @return the logTime
	 */
	public long getLogTime() {
		return logTime;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @return the pumpAddress
	 */
	public String getPumpAddress() {
		return pumpAddress;
	}

	/**
	 * @return the modeOfTransection
	 */
	public String getModeOfTransection() {
		return modeOfTransection;
	}

	/**
	 * @return the geoLocation
	 */
	public ConcurrentHashMap<String, Double> getGeoLocation() {
		return geoLocation;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param airCheck the airCheck to set
	 */
	public void setAirCheck(boolean airCheck) {
		this.airCheck = airCheck;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param amountINR the amountINR to set
	 */
	public void setAmountINR(double amountINR) {
		this.amountINR = amountINR;
	}

	/**
	 * @param amountLtr the amountLtr to set
	 */
	public void setAmountLtr(double amountLtr) {
		this.amountLtr = amountLtr;
	}

	/**
	 * @param odometerReading the odometerReading to set
	 */
	public void setOdometerReading(double odometerReading) {
		this.odometerReading = odometerReading;
	}

	/**
	 * @param timeMS the timeMS to set
	 */
	public void setTimeMS(long timeMS) {
		this.timeMS = timeMS;
	}

	/**
	 * @param logTime the logTime to set
	 */
	public void setLogTime(long logTime) {
		this.logTime = logTime;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @param pumpAddress the pumpAddress to set
	 */
	public void setPumpAddress(String pumpAddress) {
		this.pumpAddress = pumpAddress;
	}

	/**
	 * @param modeOfTransection the modeOfTransection to set
	 */
	public void setModeOfTransection(String modeOfTransection) {
		this.modeOfTransection = modeOfTransection;
	}

	/**
	 * @param geoLocation the geoLocation to set
	 */
	public void setGeoLocation(ConcurrentHashMap<String, Double> geoLocation) {
		this.geoLocation = geoLocation;
	}

	@Override
	public String toString() {
		String stringData = "id : " + id + " | airCheck : " + airCheck + " | price : " + price + " | amountINR : "
				+ amountINR + " | amountLtr : " + amountLtr + " | odometerReading : " + odometerReading + " | timeMS : "
				+ timeMS + " | logTime : " + logTime + " | brand : " + brand + " | pumpAddress : " + pumpAddress
				+ " | modeOfTransection : " + modeOfTransection + " | geoLocation : {x = " + geoLocation.get("x")
				+ ", y = " + geoLocation.get("y") + "}";
		return stringData;
	}

	public int compareTo(Expense expense) {
		PetrolExpense next = null;
		if (expense instanceof PetrolExpense)
			next = (PetrolExpense) expense;
		else
			throw new ClassCastException("Instance of Expense is not PetrolExpense type.");
		if (this.getId() == null || next.getId() == null)
			throw new NullPointerException("Id of PetrolExpense can't be Null.");
		return (int) (this.getId() - next.getId());
	}
}
