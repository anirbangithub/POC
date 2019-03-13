package com.example.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
		employee.setFirstName(rs.getString("FIRST_NAME"));
		employee.setLastName(rs.getString("LAST_NAME"));
		employee.setEmail(rs.getString("EMAIL"));
		employee.setPhone(rs.getString("PHONE"));
		employee.setJobTitle(rs.getString("JOB_TITLE"));
		return employee;
	}

}