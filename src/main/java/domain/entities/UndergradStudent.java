package domain.entities;

import domain.entities.contracts.Student;

public class UndergradStudent extends Student{
	
	private long totalCredits;
	private long payInfo;
	

	public long getTotalCredits() {
		return totalCredits;
	}

	public void setTotalCredits(long totalCredits) {
		this.totalCredits = totalCredits;
	}

	public long getPayInfo() {
		return payInfo;
	}

	public void setPayInfo(long payInfo) {
		this.payInfo = payInfo;
	}

}
