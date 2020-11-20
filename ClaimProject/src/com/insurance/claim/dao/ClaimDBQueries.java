package com.insurance.claim.dao;

public interface ClaimDBQueries {

	public static final String logIn = "select * from UserRole where user_name=? and password=?";
	
	public static final String createProfile="INSERT INTO user_role values(?,?,?)";
	
	public static final String insertClaim="INSERT INTO claim values(claim_number_seq.nextval,?,?,?,?,?,?,?)";
	
	public static final String checkClaim="select * from claim where POLICY_NUMBER=?";
	
	public static final String policyType="select * from policy where POLICY_NUMBER=?";
	
	public static final String question="select * from claim_questions where POLICY_TYPE=?";
	
	public static final String insertpolicydetail="INSERT INTO policy_details values(?,?,?)";
	
	public static final String insuredpolicy="Select * from policy where POLICY_NUMBER=?";
	
	public static final String insuredpolicy1="select * from policy where   ACCOUNT_NUMBER=?";
	
	public static final String insuredclaim="select * from claim where POLICY_NUMBER=?";
	
	public static final String insuredclaim1="select * from claim where CLAIM_NUMBER=?";
	
	public static final String insuredaccount="select * from accounts where  INSURED_NAME=?";
	
	public static final String agentaccounts="select * from accounts where user_name=?";
	
	public static final String agentaccounts1="select t1.ACCOUNT_NUMBER,t1.INSURED_NAME,t1.USER_NAME,t2.POLICY_NUMBER from accounts t1, policy t2 where t1.ACCOUNT_NUMBER=t2.ACCOUNT_NUMBER and t1.USER_NAME=?";
	
	public static final String agentclaim="select * from claim where POLICY_NUMBER IN( select  POLICY_NUMBER from policy where ACCOUNT_NUMBER IN (select ACCOUNT_NUMBER from accounts where user_name=?))";
	
	public static final String reportGeneration="select  t1.CLAIM_NUMBER, t1.CLAIM_REASON, t1.ACCIDENT_LOCATION_STREET, t1.ACCIDENT_CITY, t1.ACCIDENT_STATE, t1.ACCIDENT_ZIP, t1.CLAIM_TYPE, t3.QUES_DESC,t2.ANSWER \r\n" + 
			"from claim t1 , policy_details t2,claim_questions t3 where t1.POLICY_NUMBER=t2.POLICY_NUMBER and t2.QUESTION_ID=t3.QUES_ID and t1.POLICY_NUMBER=?";
}
