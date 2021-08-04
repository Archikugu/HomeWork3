package homeWork3;

public class StudentManager extends UserManager {
	
	
	public void addStudent(Student student) {
		System.out.println(student.getName()+" isimli öğrenci Kursa eklendi ");
	}
	public void removeStudent(Student student) {
		System.out.println(student.getName()+" isimli öğrenci kurstan silindi ");
	}
	public void updateStudent(Student student) {
		System.out.println(student.getName()+" isimli öğrenci bilgileri güncellendi ");
	}
	
	
	
	

}
