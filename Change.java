package com.savitha.leetcode;

public class Change {
	private int	quarter	= 0;
	private int	dime		= 0;
	private int	nickel	= 0;
	private int	pennies	= 0;

	public int getQuarter() {
		return quarter;
	}

	public int getDime() {
		return dime;
	}

	public int getNickel() {
		return nickel;
	}

	public int getPennies() {
		return pennies;
	}

	public void setQuarter(int quarter) {
		this.quarter = quarter;
	}

	public void setDime(int dime) {
		this.dime = dime;
	}

	public void setNickel(int nickel) {
		this.nickel = nickel;
	}

	public void setPennies(int pennies) {
		this.pennies = pennies;
	}

	@Override
	public String toString() {
		return "[quarter=" + quarter + ", dime=" + dime + ", nickel=" + nickel + ", pennies=" + pennies + "]";
	}

}
