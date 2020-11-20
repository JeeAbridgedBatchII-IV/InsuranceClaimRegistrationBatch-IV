package com.insurance.claim.daoimpl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.claim.dao.AccountDao;
import com.insurance.claim.bean.UserRole;

/**
 * Servlet implementation class InsuredClaim
 */
@WebServlet("/InsuredClaim")
public class InsuredClaim extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsuredClaim() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
response.getWriter().append("Served at: ").append(request.getContextPath());
ServletContext cText = getServletContext();
String UserName = (String) cText.getAttribute("UserName");
System.out.println(UserName);
UserRole UserRole=new UserRole(UserName);
long AccountNumber=AccountDao.getAccountNumber(UserRole);
System.out.println(AccountNumber);
long PolicyNumber=AccountDao.getPolicyNumber(AccountNumber);
System.out.println(PolicyNumber);
cText.setAttribute("PolicyNumber",PolicyNumber);
RequestDispatcher rd=request.getRequestDispatcher("ClaimInsured.jsp");  
    rd.forward(request,response);


}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);

}

}
