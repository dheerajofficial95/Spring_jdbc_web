package mypkg;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LogoffLogic {

	public String getSignOff(HttpServletRequest request) {
		
		String pn = "/WEB-INF/signoff.jsp";
		
		HttpSession session = request.getSession();
		Object x = session.getAttribute("user");
		if( x != null)
		{
			session.removeAttribute("user");
		}
		else
		{
			request.setAttribute("user","login first");
			pn ="emplogin.jsp";
		}
		
		return pn;
	}

}
