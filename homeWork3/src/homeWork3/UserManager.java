package homeWork3;

public class UserManager {
	
	public void addCourse(User user) {
		
		System.out.println(user.getName()+" "+user.getLastName() + " isimli ��renci Sisteme Ba�aral� kay�t oldu");
	}
	public void removeCourse(User user) {
		System.out.println(user.getName()+" "+"�simli ��renci Sistemden Ba�aral� �ekilde silindi");
	}
	
	
	
	public void addMultiple(User[]users) {
		for (User user : users) {
			addCourse(user);
		}
	}



}
