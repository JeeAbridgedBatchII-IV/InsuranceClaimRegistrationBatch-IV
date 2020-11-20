package com.insurance.claim.daoimpl;


	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.ArrayList;
	import java.util.List;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	/**
	 * Servlet implementation class PolicyCheck
	 */
	@WebServlet("/PolicyCheck")
	public class PolicyCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public PolicyCheck() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

	/**
	* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(request, response);
	PrintWriter out = response.getWriter();
	List<String> list=new ArrayList<String>();
	list=(ArrayList<String>)request.getAttribute("pol");
	String num=request.getParameter("policy12");
	boolean ans=list.contains(num);
	if(ans) {

	RequestDispatcher rd=request.getRequestDispatcher("ClaimCheck");  
	       rd.forward(request,response);
	}
	else {
	String txt1 = "Policy is not Available";
	    out.println("<script type=\"text/javascript\">alert('"+txt1+"');");
	    out.println("location='ClaimAdmin.jsp'");
	    out.println("</script>");

	}
	}

	}




