package com.insurance.claim.bean;


public class UserRole {

	private String UserName;
	private String Password;
	private String RoleCode;

	public UserRole() {

	}
	

	public UserRole(String UserName, String Password) {
		super();
		this.UserName = UserName;
		this.Password = Password;
	}
	public UserRole(String UserName) {
		super();
		this.UserName = UserName;
	}

	public UserRole(String UserName, String Password, String RoleCode) {
		super();
		this.UserName = UserName;
		this.Password = Password;
		this.RoleCode = RoleCode;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String UserName) {
		this.UserName = UserName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}

	public String getRoleCode() {
		return RoleCode;
	}

	public void setRoleCode(String RoleCode) {
		this.RoleCode = RoleCode;
	}

	@Override
	public String toString() {
		return "UserRole [UserName=" + UserName + ", Password=" + Password
				+ ", RoleCode=" + RoleCode + "]";
	}

}
