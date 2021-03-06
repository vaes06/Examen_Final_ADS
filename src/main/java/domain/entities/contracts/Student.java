package domain.entities.contracts;


public abstract class Student {
	
	private long id;
    private String firstName;
    private String lastName;
    private long studentCode;
    private Boolean isActive;
    private Boolean hasScholarship;
    private String studentLevel;
    private long paymenInfo;
    public long getPaymenInfo() {
		return paymenInfo;
	}
	public void setPaymenInfo(long paymenInfo) {
		this.paymenInfo = paymenInfo;
	}
	
    
	public String getStudentLevel() {
		return studentLevel;
	}
	public void setStudentLevel(String studentLeve) {
		this.studentLevel = studentLeve;
	}
		
	public long getId() {
		return id;
	}
	public Boolean getHasScholarship() {
		return hasScholarship;
	}
	public void setHasScholarship(Boolean hasScholarship) {
		this.hasScholarship = hasScholarship;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(long studentCode) {
		this.studentCode = studentCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
    

}
