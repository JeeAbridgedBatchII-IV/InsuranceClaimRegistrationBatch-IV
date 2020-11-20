package com.insurance.claim.dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	import com.insurance.claim.dao.ClaimDBQueries;
	import com.insurance.claim.bean.UserRole;
	import com.insurance.claim.utils.DatabaseConnection;

	public class ProfileCreationDao1 {
		public static boolean createProfile(UserRole UserRole) {
			boolean status = false;
			try {
				
				Connection con = DatabaseConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(ClaimDBQueries.createProfile);
				ps.setString(1, UserRole.getUserName());
				ps.setString(2, UserRole.getPassword());
				ps.setString(3, UserRole.getRoleCode());
				
				
				ResultSet rs = ps.executeQuery();
				status = rs.next();
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
			return status;
		}

	}


