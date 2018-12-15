package domain.entities;



import domain.entities.contracts.Student;

public class MasterStudent extends Student{
	
	private Boolean isMasterCandidate;
	private long payInfo;

	public long getPayInfo() {
		return payInfo;
	}

	public void setPayInfo(long payInfo) {
		this.payInfo = payInfo;
	}

	public Boolean getIsMasterCandidate() {
		return isMasterCandidate;
	}

	public void setIsMasterCandidate(Boolean isMasterCandidate) {
		this.isMasterCandidate = isMasterCandidate;
	}
		

}
