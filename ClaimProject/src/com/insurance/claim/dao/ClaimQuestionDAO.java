package com.insurance.claim.dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	import com.insurance.claim.bean.PolicyDetails;
	import com.insurance.claim.utils.DatabaseConnection;

	public class ClaimQuestionDAO {
		public static boolean insert(PolicyDetails pd) {
			boolean status = false;
			
			try {
				
				Connection con = DatabaseConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(ClaimDBQueries.insertpolicydetail);
				ps.setLong(1, pd.getPolicyNumber());
				ps.setInt(2, pd.getQuestionId());
				ps.setString(3, pd.getAnswer());
				ResultSet rs = ps.executeQuery();
				status = rs.next();
				
			} catch (Exception e) {
				System.out.println(e);
			}
			return status;
		}

	}


