package ai.jobiak.core;

import java.time.LocalDateTime;

public class CreateEmployees {

	public static void main(String[] args) {
		
		Address res=new Address("sukhdata","Visakhapatnam","1-4-114");
		Address comm=new Address("noida","Visakhapatnam","1-5-112");
		
		Employee emp1=new Employee(5353265,"krishna",LocalDateTime.now(),res,comm,12);
		
		System.out.println(emp1);

	}

}
