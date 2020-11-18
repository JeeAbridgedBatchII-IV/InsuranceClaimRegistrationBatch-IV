package com.insurance.claim.bean;

public class Policy {
	private long PolicyNumber;
	private double PolicyPremium;
	private long AccountNumber;
	//private String PolicyType;

	public Policy() {
	// TODO Auto-generated constructor stub
	}



	public Policy(long PolicyNumber, double PolicyPremium, long AccountNumber){
	super();
	this.PolicyNumber = PolicyNumber;
	this.PolicyPremium = PolicyPremium;
	this.AccountNumber = AccountNumber;
	//this.policyType = policyType;
	}



	/*public String getPolicyType() {
	return policyType;
	}



	public void setPolicyType(String policyType) {
	this.policyType = policyType;
	}*/



	public long getPolicyNumber() {
	return PolicyNumber;
	}

	public void setPolicyNumber(long PolicyNumber) {
	this.PolicyNumber = PolicyNumber;
	}

	public double getPolicyPremium() {
	return PolicyPremium;
	}

	public void setPolicyPremium(double PolicyPremium) {
	this.PolicyPremium = PolicyPremium;
	}

	public long getAccountNumber() {
	return AccountNumber;
	}

	public void setAccountNumber(long AccountNumber) {
	this.AccountNumber = AccountNumber;
	}

	@Override
	public String toString() {
	return "PolicyNumber=" + PolicyNumber + ", PolicyPremium="
	+ PolicyPremium + ", AccountNumber=" + AccountNumber;
	}
	}


