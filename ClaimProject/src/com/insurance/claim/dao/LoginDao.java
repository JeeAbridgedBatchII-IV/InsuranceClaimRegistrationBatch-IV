package com.insurance.claim.dao;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	import com.insurance.claim.dao.ClaimDBQueries;
	import com.insurance.claim.bean.UserRole;
	import com.insurance.claim.utils.DatabaseConnection;

	public class LoginDao {
		public static boolean validate(UserRole UserRole) {
			boolean status = false;
			
			try {
				
				Connection con = DatabaseConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(ClaimDBQueries.logIn);
				ps.setString(1, UserRole.getUserName());
				ps.setString(2, UserRole.getPassword());
				ResultSet rs = ps.executeQuery();
				status = rs.next();
				
			} catch (Exception e) {
				System.out.println(e);
			}
			return status;
		}
		
		public static String getRoleCode(UserRole UserRole) {
			String role="";
			
			try {
					Connection con = DatabaseConnection.getConnection();
					PreparedStatement ps = con.prepareStatement("select RoleCode from UserRole where UserName=?");
					ps.setString(1, UserRole.getUserName());
					ResultSet rs1 = ps.executeQuery();
					rs1.next();
					role = rs1.getString(1);
					System.out.println(role);
				} catch (Exception e) {
					System.out.println(e);
			}
			return role;
		}
		
	}


