package com.insurance.claim.dao;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	import com.insurance.claim.bean.Claim;
	import com.insurance.claim.utils.DatabaseConnection;

	public class ClaimCreateDaoImpl implements ClaimCreateDao {
		public int createClaim(Claim Claim) {
			
			int rows =0 ;
			try {
				
				Connection con = DatabaseConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(ClaimDBQueries.insertClaim);
				ps.setString(1, Claim.getClaimReason());
				ps.setString(2, Claim.getAccidentLocationStreet());
				ps.setString(3, Claim.getAccidentCity());
				ps.setString(4, Claim.getAccidentState());
				ps.setLong(5, Claim.getAccidentZip());
				//ps.setString(6, Claim.getClaimType());
				ps.setLong(7, Claim.getPolicyNumber());
				rows = ps.executeUpdate();
			
				
			} catch (Exception e) {
				System.out.println(e);
			}
			return rows;
		}
	}


