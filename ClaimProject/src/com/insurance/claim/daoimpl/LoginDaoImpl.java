package com.insurance.claim.daoimpl;

	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletContext;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import com.insurance.claim.dao.LoginDao;
	import com.insurance.claim.bean.UserRole;

	@WebServlet("/Login")
	public class LoginDaoImpl extends HttpServlet {  
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  

	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	    String n=request.getParameter("username");  
	    String p=request.getParameter("password");  
	    System.out.println(p);
	    UserRole user = new UserRole(n,p);
	   
	   
	    if(LoginDao.validate(user)){  
	    if(LoginDao.getRoleCode(user).equals("CLAIM_ADJUSTER"))
	    {
	        RequestDispatcher rd=request.getRequestDispatcher("Admin.jsp");  
	        rd.forward(request,response);  
	    }
	    else if(LoginDao.getRoleCode(user).equals("CLAIM_HANDLER"))
	    {
	        RequestDispatcher rd=request.getRequestDispatcher("Agent.jsp");  
	        rd.forward(request,response);  
	    }
	    else {
	    RequestDispatcher rd=request.getRequestDispatcher("Insured.jsp");  
	         rd.forward(request,response);
	    }
	    ServletContext cText = getServletContext();
	cText.setAttribute("username",n);
	    }  
	    else{  
	    String txt1 = "Invalid Username or Password!!";
	    out.println("<script type=\"text/javascript\">alert('"+txt1+"');");
	    out.println("location='Login.jsp'");
	    out.println("</script>");
	    }  
	         
	    out.close();  
	    }  
	}



