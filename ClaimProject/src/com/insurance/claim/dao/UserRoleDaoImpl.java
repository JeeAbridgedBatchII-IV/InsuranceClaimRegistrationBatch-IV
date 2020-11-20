package com.insurance.claim.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.insurance.claim.bean.UserRole;
import com.insurance.claim.utils.DatabaseConnection1;

public class UserRoleDaoImpl implements UserRoleDao{
	
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	@Override
	public int createProfile(UserRole userRole) {
		try {
			conn = DatabaseConnection1.getConnection();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int rows=0;
		try {
			pst=conn.prepareStatement(ClaimDBQueries.createProfile);
			pst.setString(1, userRole.getUserName());
			pst.setString(2, userRole.getPassword());
			pst.setString(3, userRole.getRoleCode());
			rows = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DatabaseConnection1.closeConnection();
		}
		return rows;
	}

}
