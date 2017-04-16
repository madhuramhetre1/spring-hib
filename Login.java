package comm.sunbeam.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the LOGIN database table.
 * 
 */
@Entity
@NamedQuery(name="Login.findAll", query="SELECT l FROM Login l")
public class Login  {
	private static final long serialVersionUID = 1L;
	private Integer loginId;
	private String password;
	private String role;
	private String username;
	private List<Consignment> consignments;
	private List<Employee> employees;

	public Login() {
	}


	@Id
	@SequenceGenerator(name="seq_Login_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_Login_ID")
	@Column(name="LOGIN_ID")
	public Integer getLoginId() {
		return this.loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Column(name="\"ROLE\"")
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	//bi-directional many-to-one association to Consignment
	@OneToMany(mappedBy="login")//, fetch=FetchType.EAGER)
	public List<Consignment> getConsignments() {
		return this.consignments;
	}

	public void setConsignments(List<Consignment> consignments) {
		this.consignments = consignments;
	}

	public Consignment addConsignment(Consignment consignment) {
		getConsignments().add(consignment);
		consignment.setLogin(this);

		return consignment;
	}

	public Consignment removeConsignment(Consignment consignment) {
		getConsignments().remove(consignment);
		consignment.setLogin(null);

		return consignment;
	}


	//bi-directional many-to-one association to Employee
	@OneToMany(mappedBy="login")//, fetch=FetchType.EAGER)
	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee addEmployee(Employee employee) {
		getEmployees().add(employee);
		employee.setLogin(this);

		return employee;
	}

	public Employee removeEmployee(Employee employee) {
		getEmployees().remove(employee);
		employee.setLogin(null);

		return employee;
	}

}