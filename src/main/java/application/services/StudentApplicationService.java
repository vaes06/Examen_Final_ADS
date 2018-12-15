package application.services;

import org.springframework.beans.factory.annotation.Autowired;

import application.dtos.StudentDto;
import domain.entities.contracts.repository.StudentRepository;

public class StudentApplicationService {
	@Autowired
	StudentRepository studentRepository;

	public StudentDto getPayment(StudentDto studentDto) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
	
	
	
	
	

}
