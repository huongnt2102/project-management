package com.hg.pma.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.hg.pma.dao.EmployeeRepository;
import com.hg.pma.entities.Employee;

public class UniqueValidator implements ConstraintValidator<UniqueValue, String> {
	
	
	@Autowired
	EmployeeRepository empRepo;
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		System.out.println("Entered validation method..");
		Employee emp = empRepo.findByEmail(value);
		
		if (emp != null)
			return false;
		else
			return true;
	}
}
