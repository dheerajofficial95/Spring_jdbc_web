package mypkg;

public class Employee {

	private int empno, deptid;
	private String empname;
	
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public Employee() {

	}

	public Employee(int empno, int deptid, String empname) {
		this.empno = empno;
		this.deptid = deptid;
		this.empname = empname;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
}
