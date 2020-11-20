package com.insurance.claim.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.insurance.claim.bean.UserRole;
import com.insurance.claim.utils.DatabaseConnection;

	public class AccountDao {
		public static long getAccountNo(UserRole UserRole) {
			long Account=0;
			
			try {
				
				Connection con = DatabaseConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(ClaimDBQueries.insuredaccount);
				ps.setString(1, UserRole.getUserName());
				ResultSet rs = ps.executeQuery();
				rs.next();
				Account =Long.parseLong(rs.getString(1));
				
			} catch (Exception e) {
				System.out.println(e);
			}
			return Account;
		}
		public static long getPolicyNumber(long AccountNumber) {
			long Policy=0;
			try {
				
				Connection con = DatabaseConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(ClaimDBQueries.insuredpolicy1);
				ps.setLong(1, AccountNumber);
				ResultSet rs = ps.executeQuery();
				rs.next();
				Policy =Long.parseLong(rs.getString(1));
				
			} catch (Exception e) {
				System.out.println(e);
			}
			return Policy;
		}
		public static long getClaimNumber(long Policy) {
			long Claim=0;
			try {
				
				Connection con = DatabaseConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(ClaimDBQueries.insuredclaim);
				ps.setLong(1, Policy);
				ResultSet rs = ps.executeQuery();
				rs.next();
				Claim =Long.parseLong(rs.getString(1));
				
			} catch (Exception e) {
				System.out.println(e);
			}
			return Claim;
		}
		public static long getAccountNumber(UserRole userRole) {
			// TODO Auto-generated method stub
			return 0;
		}

}
