package com.insurance.claim.daoimpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.claim.dao.ClaimCheckDao;
import com.insurance.claim.dao.LoginDao;
import com.insurance.claim.bean.Claim;
import com.insurance.claim.bean.UserRole;

/**
 * Servlet implementation class ClaimCheck
 */
@WebServlet("/ClaimCheck")
public class ClaimCheck extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClaimCheck() {
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
response.setContentType("text/html");  
   PrintWriter out = response.getWriter();  
   Long n=Long.parseLong(request.getParameter("policy12"));    
   Claim Claim = new Claim(n);
   ServletContext cText = getServletContext();
   List<Long> list=(List<Long>) cText.getAttribute("list");
   
boolean ans=list.contains(n);
if(ans) {
   if(ClaimCheckDao.validate(Claim)){  
    String txt1 = "Claim is already created!";
    out.println("<script type=\"text/javascript\">alert('"+txt1+"');");
    out.println("location='admin2.jsp'");
    out.println("</script>");
       
   }  
   else{  
   
    RequestDispatcher rd=request.getRequestDispatcher("ClaimC.jsp");  
       rd.forward(request,response);
   }  
}
else {
String txt1 = "you cannot create claim for this policy";
    out.println("<script type=\"text/javascript\">alert('"+txt1+"');");
    out.println("location='admin2.jsp'");
    out.println("</script>");

}
   out.close();  
   }  
}

