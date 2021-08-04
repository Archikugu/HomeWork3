package homeWork3;

public class UserManager {
	
	public void addCourse(User user) {
		
		System.out.println(user.getName()+" "+user.getLastName() + " isimli öðrenci Sisteme Baþaralý kayýt oldu");
	}
	public void removeCourse(User user) {
		System.out.println(user.getName()+" "+"Ýsimli öðrenci Sistemden Baþaralý þekilde silindi");
	}
	
	
	
	public void addMultiple(User[]users) {
		for (User user : users) {
			addCourse(user);
		}
	}



}
