package com.wsdlfirst;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.feature.Features;

import com.wsdlfirst.sample.EmpDataPortType;
import com.wsdlfirst.sample.EmployeeData;
import com.wsdlfirst.sample.GetEmployeeRequest;
import com.wsdlfirst.sample.GetEmployeeResponse;

import jakarta.jws.WebService;

@Features(features = "org.apache.cxf.feature.LoggingFeature")
@WebService(endpointInterface = "com.wsdlfirst.sample.EmpDataPortType")
public class EmpDataWsImpl implements EmpDataPortType {

	List<EmployeeData> employees = new ArrayList<>();
	int currentId;

	public EmpDataWsImpl() {
		init();
	}

	public void init() {
		EmployeeData employeeData1 = new EmployeeData();
		employeeData1.setEmpId("111");
		employeeData1.setName("sita");
		employeeData1.setAge(new BigInteger("44"));
		EmployeeData employeeData2 = new EmployeeData();
		employeeData1.setEmpId("125");
		employeeData1.setName("gita");
		employeeData1.setAge(new BigInteger("24"));
		this.employees.add(employeeData1);
		this.employees.add(employeeData2);
	}

	@Override
	public GetEmployeeResponse getEmpData(GetEmployeeRequest parameters) {
		GetEmployeeResponse response = new GetEmployeeResponse();
		response.getEmployeeData().addAll(this.employees);
		return response;
	}

}
