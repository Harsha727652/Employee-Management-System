package in.harsha.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="employee_data")
public class Employe {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)	
@Column(name="EMP_ID")
private long empId;
@Column(name="EMPLOYE_FIRST_NAME")
private String firstName;
@Column(name="EMPLOYE_LAST_NAME")
private String lastName;
@Column(name="AGE")
private Long age;
@Column(name="EMPLOYE_ADDRESS")
private String address;
@Column(name="DEPARTMENT")
private String department;
@Column(name="MAIL_ID")
private String mailId;

public long getEmpId() {
	return empId;
}
public void setEmpId(long empId) {
	this.empId = empId;
}
public Long getAge() {
	return age;
}
public void setAge(Long age) {
	this.age = age;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getMailId() {
	return mailId;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}


}
