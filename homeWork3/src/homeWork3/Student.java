package homeWork3;

public class Student extends User {
	
	String homeWork;
	
	public Student() {
			
	}
	
	
	public Student(int id, String name, String lastName, String email, String password, String homeWork) {
		super(id, name, lastName, email, password);
		this.homeWork = homeWork;
	}
	
	
	public String getHomeWork() {
		return homeWork;
	}

	public void setHomeWork(String homeWork) {
		this.homeWork = homeWork;
	}


	


	

	
	


}
