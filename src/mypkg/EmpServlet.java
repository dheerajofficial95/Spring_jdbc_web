package mypkg;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/fca")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		
	}
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String why = request.getParameter("why"); // if parameter name is wrong you get logical errors.
		String pn="";
		
		if(why.equals("login"))
		{
			LoginLogic x =new LoginLogic();
			pn = x.getDoLogin(request);
		}
		else if(why.equals("logoff"))
		{
			LogoffLogic x =new LogoffLogic();
			pn = x.getSignOff(request);
		}
		else if(why.equals("gete"))
		{
			GetEmployeeLogic x =new GetEmployeeLogic();
			pn = x.getEmployeeDetails(request);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(pn);
		rd.forward(request, response);
	}

}
