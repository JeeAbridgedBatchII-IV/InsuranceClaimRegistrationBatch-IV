package com.insurance.claim.service;

import com.insurance.claim.bean.UserRole;
import com.insurance.claim.dao.UserRoleDao;
import com.insurance.claim.dao.UserRoleDaoImpl;

public class UserRoleServiceImpl implements UserRoleService{
	
	private UserRoleDao dao=new UserRoleDaoImpl();
	
	@Override
	public int createProfile(UserRole userRole) {
		int rows = dao.createProfile(userRole);
		return rows;
	}
	
	

}
