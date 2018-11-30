package mypkg;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GetEmployeeLogic {

	public String getEmployeeDetails(HttpServletRequest request) {
		
		String pagename="emp.jsp";
		
		HttpSession session = request.getSession();
		if(session.getAttribute("user") == null)
		{
			request.setAttribute("user","login first");
			pagename ="emplogin.jsp";
			return pagename;
		}
		
		String s =request.getParameter("empno");
		int empno = Integer.parseInt(s);
		
		//asking to spring to create objects and start wiring.
		AnnotationConfigApplicationContext c =new AnnotationConfigApplicationContext(EntryPointForSpring.class);
		Service123 ser = c.getBean(Service123.class);
		Employee e = ser.getEmployeeInfo(empno);	//service function call.
		
		if(e !=null)
		{
				request.setAttribute("scrap", empno  + " is found");
				request.setAttribute("eo",e);
		}
		else
		{
			request.setAttribute("scrap", empno  + " is not  found");	
		}
		
		System.out.println("employee details should be got");
		
		return pagename ;
	}
}
