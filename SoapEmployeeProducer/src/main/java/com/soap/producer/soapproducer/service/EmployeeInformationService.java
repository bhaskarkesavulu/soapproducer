package com.soap.producer.soapproducer.service;

import org.springframework.stereotype.Service;

import com.soap.producer.soapproducer.employee_information.EmployeeInformation;
import com.soap.producer.soapproducer.employee_information.Gender;
import com.soap.producer.soapproducer.employee_information.GetEmployeeInformationResponse;

@Service
public class EmployeeInformationService {

	public GetEmployeeInformationResponse getEmployeeInformationByEmployeeId(String employeeId) {

		if (employeeId.equalsIgnoreCase("100")) {
			var employeeInformation = new EmployeeInformation();
			employeeInformation.setDepartment("IT Development");
			employeeInformation.setDesignation("Software Engineer");
			employeeInformation.setEmployeeName("John Doe");
			employeeInformation.setGender(Gender.MALE);
			employeeInformation.setSalary(50000);
			var response = new GetEmployeeInformationResponse();
			response.setEmployeeInformation(employeeInformation);
			return response;
		} else if (employeeId.equalsIgnoreCase("101")) {
			var employeeInformation = new EmployeeInformation();
			employeeInformation.setDepartment("IT Support");
			employeeInformation.setDesignation("Software Engineer");
			employeeInformation.setEmployeeName("Jessica");
			employeeInformation.setGender(Gender.FEMALE);
			employeeInformation.setSalary(500000);
			var response = new GetEmployeeInformationResponse();
			response.setEmployeeInformation(employeeInformation);
			return response;
		} else if (employeeId.equalsIgnoreCase("102")) {
			var employeeInformation = new EmployeeInformation();
			employeeInformation.setDepartment("IT Operations");
			employeeInformation.setDesignation("Engineer");
			employeeInformation.setEmployeeName("Rob");
			employeeInformation.setGender(Gender.MALE);
			employeeInformation.setSalary(10000);
			var response = new GetEmployeeInformationResponse();
			response.setEmployeeInformation(employeeInformation);
			return response;
		} else {
			return new GetEmployeeInformationResponse();
		}

	}

}
