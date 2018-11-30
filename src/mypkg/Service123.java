package mypkg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service123 {

	@Autowired
	private DAOLayer  d;
	
	public Employee getEmployeeInfo(int empno) {
		
		return d.getEmployeeInfo(empno);
	}

}
