package ai.jobiak.core;

import java.time.LocalDateTime;

public class Employee {
	int empId;
	String empName;
	LocalDateTime dateOfJoining;
	Address residence;
	Address communication;
	int managerId;
	
	
	
	public Employee() {
		
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, LocalDateTime dateOfJoining, Address residence, Address communication,
			int managerId) {
		
		this.empId = empId;
		this.empName = empName;
		this.dateOfJoining = dateOfJoining;
		this.residence = residence;
		this.communication = communication;
		this.managerId = managerId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public LocalDateTime getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDateTime dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Address getResidence() {
		return residence;
	}

	public void setResidence(Address residence) {
		this.residence = residence;
	}

	public Address getCommunication() {
		return communication;
	}

	public void setCommunication(Address communication) {
		this.communication = communication;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dateOfJoining=" + dateOfJoining + ", residence="
				+ residence + ", communication=" + communication + ", managerId=" + managerId + "]";
	}
	
	
}
