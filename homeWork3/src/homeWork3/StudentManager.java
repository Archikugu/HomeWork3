package homeWork3;

public class StudentManager extends UserManager {
	
	
	public void addStudent(Student student) {
		System.out.println(student.getName()+" isimli ��renci Kursa eklendi ");
	}
	public void removeStudent(Student student) {
		System.out.println(student.getName()+" isimli ��renci kurstan silindi ");
	}
	public void updateStudent(Student student) {
		System.out.println(student.getName()+" isimli ��renci bilgileri g�ncellendi ");
	}
	
	
	
	

}
