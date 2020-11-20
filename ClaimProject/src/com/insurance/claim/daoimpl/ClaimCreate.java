//package com.insurance.claim.daoimpl;
//
//	import java.io.IOException;
//	import java.io.PrintWriter;
//
//	import javax.servlet.RequestDispatcher;
//	import javax.servlet.ServletException;
//	import javax.servlet.annotation.WebServlet;
//	import javax.servlet.http.HttpServlet;
//	import javax.servlet.http.HttpServletRequest;
//	import javax.servlet.http.HttpServletResponse;
//
//	import com.insurance.claim.dao.ClaimCheckDao;
//	import com.insurance.claim.dao.ClaimCreateDao;
//	import com.insurance.claim.bean.Claim;
//
//	/**
//	 * Servlet implementation class ClaimCreate
//	 */
//	@WebServlet("/ClaimCreate")
//	public class ClaimCreate extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	       
//	    /**
//	     * @see HttpServlet#HttpServlet()
//	     */
//	    public ClaimCreate() {
//	        super();
//	        // TODO Auto-generated constructor stub
//	    }
//
//	/**
//	* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	*/
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	// TODO Auto-generated method stub
//	response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	*/
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	// TODO Auto-generated method stub
//	doGet(request, response);
//	response.setContentType("text/html");  
//	   PrintWriter out = response.getWriter();  
//	   String n1=request.getParameter("PolicyNumber");
//	   System.out.println(n1);
//	   Long n=Long.parseLong(request.getParameter("PolicyNumber"));
//	   System.out.println(n);
//	   String ClaimReason=request.getParameter("ClaimReason");
//	   System.out.println(ClaimReason);
//	   String AccidentLocationStreet=request.getParameter("AccidentLocationStreet");
//	   System.out.println(AccidentLocationStreet);
//	   String AccidentCity=request.getParameter("AccidentCity");
//	   System.out.println(AccidentCity);
//	   String AccidentState=request.getParameter("AccidentState");
//	   System.out.println(AccidentState);
//	   Long AccidentZip=Long.parseLong(request.getParameter("AccidentZip"));
//	   System.out.println(AccidentZip);
//	   String ClaimType=request.getParameter("CLaimType");
//	   System.out.println(ClaimType);
//	   Claim Claim = new Claim(ClaimReason,AccidentLocationStreet,AccidentCity,AccidentState,AccidentZip,ClaimType,n);
//	   
//	   
//	   if(ClaimCreateDao.create(Claim)){  
//	    String txt1 = "Claim data is processing";
//	    out.println("<script type=\"text/javascript\">alert('"+txt1+"');");
//	    out.println("location='Admin2.jsp'");
//	    out.println("</script>");
//	    RequestDispatcher rd=request.getRequestDispatcher("ClaimQuestions.jsp");  
//	       rd.forward(request,response);
//	   }  
//	   else{  
//	   
//	    String txt1 = "Error better try after some time";
//	    out.println("<script type=\"text/javascript\">alert('"+txt1+"');");
//	    out.println("location='Admin2.jsp'");
//	    out.println("</script>");
//	   }  
//	         
//	   out.close();  
//	   }  
//
//	}
//
