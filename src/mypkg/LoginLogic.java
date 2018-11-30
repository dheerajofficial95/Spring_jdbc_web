package mypkg;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginLogic {

	public String getDoLogin(HttpServletRequest request) {
		
		String pn = "/emplogin.jsp";
		
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		
		if(userid.equals(pwd))
		{
			HttpSession session = request.getSession();
			session.setAttribute("user",userid);
			pn ="/emp.jsp";
			
		}
		else
		{
			//writing on request notice board
			request.setAttribute("user","invalid username or password");
			
		}
		
		return pn;
	}
}
