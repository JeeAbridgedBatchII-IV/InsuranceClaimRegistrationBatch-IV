package com.insurance.claim.bean;

import java.io.Serializable;

public class Account implements Serializable {
/**
*
*/
private static final long serialVersionUID = 1L;
private long AccountNumber;
private String InsuredName;
private String UserName;

public Account() {
// TODO Auto-generated constructor stub
}

public Account(long AccountNumber, String InsuredName, String UserName) {
super();
this.AccountNumber = AccountNumber;
this.InsuredName = InsuredName;
this.UserName = UserName;
}

public long getAccountNumber() {
return AccountNumber;
}

public void setAccountNumber(long AccountNumber) {
this.AccountNumber = AccountNumber;
}

public String getInsuredName() {
return InsuredName;
}

public void setInsuredName(String InsuredName) {
this.InsuredName = InsuredName;
}

public String getUserName() {
return UserName;
}

public void setUserName(String UserName) {
this.UserName = UserName;
}

@Override
public String toString() {
return "Accounts [AccountNumber=" + AccountNumber + ", InsuredName="
+ InsuredName + ", UserName=" + UserName + "]";
}
}