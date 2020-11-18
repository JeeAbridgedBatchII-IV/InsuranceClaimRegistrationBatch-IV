package com.insurance.claim.bean;

public class ClaimQuestions {
	private int QuesId;
	private String PolicyType;
	private String QuesDesc;
	private String QuesAns1;
	private String QuesAns2;

	public ClaimQuestions() {
	// TODO Auto-generated constructor stub
	}

	public ClaimQuestions(int QuesId, String PolicyType, String QuesDesc,
	String QuesAns1, String QuesAns2) {
	super();
	this.QuesId = QuesId;
	this.PolicyType = PolicyType;
	this.QuesDesc = QuesDesc;
	this.QuesAns1 = QuesAns1;
	this.QuesAns2 = QuesAns2;
	}

	public int getQuesId() {
	return QuesId;
	}

	public void setQuesId(int QuesId) {
	this.QuesId = QuesId;
	}

	public String getPolicyType() {
	return PolicyType;
	}

	public void setPolicyType(String PolicyType) {
	this.PolicyType = PolicyType;
	}

	public String getQuesDesc() {
	return QuesDesc;
	}

	public void setQuesDesc(String QuesDesc) {
	this.QuesDesc = QuesDesc;
	}

	public String getQuesAns1() {
	return QuesAns1;
	}

	public void setQuesAns1(String QuesAns1) {
	this.QuesAns1 = QuesAns1;
	}

	public String getQuesAns2() {
	return QuesAns2;
	}

	public void setQuesAns2(String QuesAns2) {
	this.QuesAns2 = QuesAns2;
	}

	@Override
	public String toString() {
	return "ClaimQuestions [QuesId=" + QuesId + ", PolicyType="
	+ PolicyType + ", QuesDesc=" + QuesDesc + ", QuesAns1="
	+ QuesAns1 + ", QuesAns2=" + QuesAns2 + "]";
	}
	}


