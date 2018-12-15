package domain.operation;

import domain.entities.contracts.Student;

public class PaymentService {
	
	private long payInfo;
	private Student student;
	
	
	public double getPaymentInfo(Student student){
	if (student.getStudentLevel() == "Doctorate") {
		double discount = 0.5;
		return student.getPaymenInfo()*discount;
	}
			
	if (student.getStudentLevel() == "Magister") {
			double discount = 0.8;
			return student.getPaymenInfo()*discount;
	}
	
	if (student.getStudentLevel() == "Undergrad") {
		double discount = 0.9;
		return student.getPaymenInfo()*discount;
	}
	return 0;
	}

}
