package com.insurance.claim.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.claim.bean.UserRole;
import com.insurance.claim.service.UserRoleService;
import com.insurance.claim.service.UserRoleServiceImpl;

/**
 * Servlet implementation class ProfileCreation
 */
@WebServlet("/ProCreate")
public class UserRoleController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();

		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String roleCode = request.getParameter("role");
		UserRole userRole = new UserRole(userName, password, roleCode);
		UserRoleService service = new UserRoleServiceImpl();
	    int rows = service.createProfile(userRole);
		if(rows>0)
			out.println("record inserted...");
		else
			out.println("not inserted...");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
