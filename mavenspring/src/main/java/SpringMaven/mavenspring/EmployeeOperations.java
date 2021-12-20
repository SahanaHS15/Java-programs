package SpringMaven.mavenspring;



import org.springframework.jdbc.core.JdbcTemplate;



public class EmployeeOperations {
JdbcTemplate jdbcTemplate;



//public JdbcTemplate getJdbcTemplate() {
//	return jdbcTemplate;
//}



public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}



int insert(Employee emp)
{
String name=emp.getName();
String department=emp.getEmail();
String id=emp.getId();
String salary=emp.getSalary();

String query="insert into Employee values('"+name+"','"+id+"','"+salary+"','"+department+"')";
int result=jdbcTemplate.update(query);

return result;
}



}