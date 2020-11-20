package com.insurance.claim.service;

import com.insurance.claim.bean.Claim;
import com.insurance.claim.dao.ClaimCreateDaoImpl;
import com.insurance.claim.dao.UserRoleDao;
import com.insurance.claim.dao.UserRoleDaoImpl;

public class ClaimServiceImpl implements ClaimService{
	
	private ClaimCreateDaoImpl dao=new ClaimCreateDaoImpl();
	
	@Override
	public int createClaim(Claim claim) {
		int rows= dao.createClaim(claim);
		return rows;	
		}
	}

