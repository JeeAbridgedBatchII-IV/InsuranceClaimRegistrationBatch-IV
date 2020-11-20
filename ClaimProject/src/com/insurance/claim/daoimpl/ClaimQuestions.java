package com.insurance.claim.daoimpl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.claim.dao.ClaimQuestionDAO;
import com.insurance.claim.bean.PolicyDetails;

/**
 * Servlet implementation class ClaimQuestion
 */
@WebServlet("/ClaimQuestion")
public class ClaimQuestions extends HttpServlet {
private static final long serialVersionUID = 1L;

/**
* @see HttpServlet#HttpServlet()
*/
public ClaimQuestions() {
super();
// TODO Auto-generated constructor stub
}

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
*      response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
// TODO Auto-generated method stub
response.getWriter().append("Served at: ").append(request.getContextPath());

// Long policyno=(Long)request.getAttribute("PolicyNumber1");

response.setContentType("text/html");  
   PrintWriter out = response.getWriter();
ServletContext cText = getServletContext();
long PolicyNumber = (long) cText.getAttribute("PolicyNumber1");

System.out.println("Servlet Policy no: " + PolicyNumber);
for (int i = 21; i <= 23; i++) {
int id = (int) i;
String Answer = request.getParameter(Integer.toString(i));
System.out.println(Answer);
PolicyDetails pd = new PolicyDetails(PolicyNumber, id, Answer);
ClaimQuestionDAO.insert(pd);

}
String txt1 = "Claim created Successfully";
    out.println("<script type=\"text/javascript\">alert('"+txt1+"');");
    out.println("location='Admin2.jsp'");
    out.println("</script>");
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
*      response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);

}

}
