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
	 * Servlet implementation class InsuredView
	 */
	@WebServlet("/InsuredView")
	public class InsuredView extends HttpServlet {
	private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public InsuredView() {
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
	String username = (String) cText.getAttribute("username");
	System.out.println(username);
	UserRole ur=new UserRole(username);
	long acc=AccountDao.getAccountNo(ur);
	System.out.println(acc);
	long PolicyNumber=AccountDao.getPolicyNumber(acc);
	System.out.println(PolicyNumber);
	long claimNo=AccountDao.getClaimNumber(PolicyNumber);
	System.out.println(claimNo);

	cText.setAttribute("ClaimNo",claimNo);
	RequestDispatcher rd=request.getRequestDispatcher("InsuredView.jsp");  
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



