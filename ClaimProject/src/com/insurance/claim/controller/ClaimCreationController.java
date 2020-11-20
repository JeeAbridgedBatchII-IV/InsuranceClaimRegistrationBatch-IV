package com.insurance.claim.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.claim.bean.Claim;
//import com.insurance.claim.bean.UserRole;
import com.insurance.claim.service.ClaimService;
import com.insurance.claim.service.ClaimServiceImpl;
//import com.insurance.claim.service.UserRoleService;
//import com.insurance.claim.service.UserRoleServiceImpl;

@WebServlet("/ClaimCreate")
public class ClaimCreationController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		
		//int claimNumber = Integer.parseInt(request.getParameter("claimnumber"));
		String claimReason = request.getParameter("reason");
		String accidentLocationStreet = request.getParameter("location");
		String accidentCity = request.getParameter("city");
		String accidentState = request.getParameter("state");
		int accidentZip = Integer.parseInt(request.getParameter("zip"));
		String claimType = request.getParameter("ctype");
		int claimNumber = Integer.parseInt(request.getParameter("policyn"));
		Claim claim= new Claim(claimReason,accidentLocationStreet,accidentCity,accidentState,accidentZip,claimType,claimNumber);
		ClaimService service = (ClaimService) new ClaimServiceImpl();
	    int rows = service.createClaim(claim);
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
