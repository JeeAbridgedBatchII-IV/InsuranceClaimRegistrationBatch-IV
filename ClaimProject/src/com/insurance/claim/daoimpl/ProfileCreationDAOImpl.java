package com.insurance.claim.daoimpl;


	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.regex.Pattern;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import com.insurance.claim.dao.ProfileCreationDao1;
	import com.insurance.claim.bean.UserRole;

	@WebServlet("/ProCreate")
	public class ProfileCreationDAOImpl extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	       throws ServletException, IOException {  

	   response.setContentType("text/html");  
	   PrintWriter out = response.getWriter();  
	   
	   String uname = request.getParameter("username");  
	   String pwd = request.getParameter("password");  
	   String rolecode = request.getParameter("role");  
	   System.out.println(uname);
	   System.out.println(pwd);
	   System.out.println(rolecode);
	   String pattern = "[A-Z]{1}[a-zA-Z0-9]{3,19}";
	   boolean matches = Pattern.matches(pattern, uname);
	   String pattern1 = "[A-Z]{1}[a-zA-z0-9@$%*#_-]{6,11}";
	   boolean matches1 = Pattern.matches(pattern1, pwd);
	   if(!matches) {
	    String txt="Invalid Username";
	    out.println("<script type=\"text/javascript\">alert('"+txt+"');");
	    out.println("location='ProCreate.jsp'");
	    out.println("</script>");
	   }
	   
	   else if(!matches1) {
	    String txt="Invalid Password";
	    out.println("<script type=\"text/javascript\">alert('"+txt+"');");
	    out.println("location='ProCreate.jsp'");
	    out.println("</script>");
	   }
	   else if (rolecode.equals("CLAIM_ADJUSTER") || rolecode.equals("CLAIM_HANDLER")|| rolecode.equals("INSURED"))
	   {
	   UserRole user = new UserRole(uname, pwd, rolecode);
	   
	   String txt = "Profile Created Successfully!!";
	   
	   if(ProfileCreationDao1.createProfile(user)) {
	    out.println("<script type=\"text/javascript\">alert('"+txt+"');");
	    out.println("location='ProCreate.jsp'");
	    out.println("</script>");
	    //RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");  
	       //rd.forward(request,response);
	   }
	   }
	   else {
	    String txt1 = "Username Already Exist!!";
	    out.println("<script type=\"text/javascript\">alert('"+txt1+"');");
	    out.println("location='ProCreate.jsp'");
	    out.println("</script>");
	   }
	   
	         
	   out.close();  
	   }  

	}



