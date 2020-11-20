package com.insurance.claim.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.insurance.claim.bean.Claim;
import com.insurance.claim.utils.DatabaseConnection;
public class ClaimCheckDao {
	public static boolean validate(Claim Claim) {
		boolean status = false;
		
		try {
			
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(ClaimDBQueries.checkClaim);
			ps.setLong(1, Claim.getPolicyNumber());
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

}



