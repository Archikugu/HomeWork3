package homeWork3;

public class Instructor extends User {

	String course;

	public Instructor() {
		
	}
	
	public Instructor(int id, String name, String lastName, String email, String password, String course) {
		super(id, name, lastName, email, password);
		this.course = course;
	}
	
	
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}



	

}
