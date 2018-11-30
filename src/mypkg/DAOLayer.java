package mypkg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DAOLayer {
	
	@Autowired
	private JdbcTemplate t;

	public Employee getEmployeeInfo(int empno) {
		
		System.out.println(t != null ? "jdbc template got" :"not got");
		
		String sql="select empno,empname,deptid from emp where empno = ?";
		Object params[]= {empno};
		Employee e=null;
		try 
		{
			e = t.queryForObject(sql, params,
					new BeanPropertyRowMapper<Employee>(Employee.class));
		} catch (DataAccessException e1) {
			// TODO Auto-generated catch block
			
		}
		
		return e;
	}

}
