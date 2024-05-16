package com.example.demo.model;



import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)                                      
	private Long EmpId;
	
	@Column(name = "first_name")
	private String EmpFirstName;
	@Column(name = "User Name")
	private String userName;
	
	@Column(name = "last_name")
	private String EmpLastName;
	@Column(name = "email", unique = true)
	private String EmpEmail;
	private String EmpPassword;
	//@ManyToOne
	private String EmpAddress;                         
	private Long Empsalary;
	private Date EmpJoiningDate;
	private Date EmpReleavingDate;
	private String EmpQualification;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public User()
	{
		
	}

	/*
	 * {
	 * "Empid":1,
	 * "EmpFirstName":"priya",
	 * "EmpLastName":"chowdhary",
	 * "EmpEmail":"l@gmail.com",
	 * "EmpPassword":"priya@123",
	 * "EmpAddress:"tirupati",
	 * "Empsalary":20000,
	 * "EmpJoiningDate":01-03-2024,
	 * "EmpReleavingDate":09-03-2024
	 * }*/
	
	public Long getEmpId() {
		return EmpId;
	}

	
	public User(Long empId, String empFirstName, String empLastName, String empEmail, String empPassword,
			String empAddress, Long empsalary, Date empJoiningDate,Date empReleavingDate, String empQualification) {
		super();
		EmpId = empId;
		EmpFirstName = empFirstName;
		EmpLastName = empLastName;
		EmpEmail = empEmail;
		EmpPassword = empPassword;
		EmpAddress = empAddress;
		Empsalary = empsalary;
		EmpJoiningDate = empJoiningDate;
		EmpReleavingDate = empReleavingDate;
		EmpQualification = empQualification;
	}

	public String getEmpFirstName() {
		return EmpFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		EmpFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return EmpLastName;
	}

	public void setEmpLastName(String empLastName) {
		EmpLastName = empLastName;
	}

	public String getEmpEmail() {
		return EmpEmail;
	}

	public void setEmpEmail(String empEmail) {
		EmpEmail = empEmail;
	}

	public String getEmpPassword() {
		return EmpPassword;
	}

	public void setEmpPassword(String empPassword) {
		EmpPassword = empPassword;
	}

	public Long getEmpsalary() {
		return Empsalary;
	}

	public void setEmpsalary(Long empsalary) {
		Empsalary = empsalary;
	}

	public Date getEmpJoiningDate() {
		return EmpJoiningDate;
	}

	public void setEmpJoiningDate(Date empJoiningDate) {
		EmpJoiningDate = empJoiningDate;
	}

	public Date getEmpReleavingDate() {
		return EmpReleavingDate;
	}

	public void setEmpReleavingDate(Date empReleavingDate) {
		EmpReleavingDate = empReleavingDate;
	}

	public String getEmpQualification() {
		return EmpQualification;
	}

	public void setEmpQualification(String empQualification) {
		EmpQualification = empQualification;
	}

	public void setEmpId(Long empId) {
		EmpId = empId;
	}

	public String getEmpAddress() {
		return EmpAddress;
	}

	public void setEmpAddress(String empAddress) {
		EmpAddress = empAddress;
	}

}