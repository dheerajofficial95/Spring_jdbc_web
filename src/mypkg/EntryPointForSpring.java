package mypkg;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

@ComponentScan("mypkg")
public class EntryPointForSpring {

	@Bean
	public JdbcTemplate get()
	{
		BasicDataSource s = new BasicDataSource();
		s.setDriverClassName("com.mysql.jdbc.Driver");
		s.setUrl("jdbc:mysql://localhost/assignment");
		s.setUsername("root");
		s.setPassword("mypwd");
		JdbcTemplate t =new JdbcTemplate(s);
		return t;	
	}
	
}
