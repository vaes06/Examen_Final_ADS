package application.dtos;

public class StudentDto {
	
	private long id;
    private String firstName;
    private String lastName;
    private long paymenInfo;
    private String studentLevel;
    
    StudentDto() {
    
    }
      

	public StudentDto(long id) {
		super();
		this.id = id;
	}


	public long getId() {
		return id;
	}
	public String getStudentLevel() {
		return studentLevel;
	}
	public void setStudentLevel(String studentLevel) {
		this.studentLevel = studentLevel;
	}
	public void setId(long id) {
		this.id = id;
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
	public long getPaymenInfo() {
		return paymenInfo;
	}
	public void setPaymenInfo(long paymenInfo) {
		this.paymenInfo = paymenInfo;
	}

}
