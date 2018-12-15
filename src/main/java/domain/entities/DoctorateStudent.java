package domain.entities;

import domain.entities.contracts.Student;

public class DoctorateStudent extends Student {
	
	private boolean hasThesis;
	private long payInfo;
		
	public boolean isHasThesis() {
		return hasThesis;
	}
	public void setHasThesis(boolean hasThesis) {
		this.hasThesis = hasThesis;
	}
	public long getPayInfo() {
		return payInfo;
	}
	public void setPayInfo(long payInfo) {
		this.payInfo = payInfo;
	}
	

	
	
	
	
	

}
