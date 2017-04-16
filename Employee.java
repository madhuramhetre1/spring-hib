package comm.sunbeam.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the EMPLOYEE database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee  {
	private static final long serialVersionUID = 1L;
	private Integer empId;
	private String designation;
	private Date dob;
	private String emailId;
	private String empAddress;
	private String empName;
	private String gender;
	private Integer mobileNo;
	private String qualification;
	private Login login;

	public Employee() {
	}


	@Id
	@SequenceGenerator(name="seq_Employee_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_Employee_ID")
	@Column(name="EMP_ID")
	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}


	@Temporal(TemporalType.DATE)
	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}


	@Column(name="EMAIL_ID")
	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@Column(name="EMP_ADDRESS")
	public String getEmpAddress() {
		return this.empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}


	@Column(name="EMP_NAME")
	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	@Column(name="MOBILE_NO")
	public Integer getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}


	@Column(name="\"QUALIFICATION\"")
	public String getQualification() {
		return this.qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	//bi-directional many-to-one association to Login
	@ManyToOne
	@JoinColumn(name="LOGIN_ID")
	public Login getLogin() {
		return this.login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

}