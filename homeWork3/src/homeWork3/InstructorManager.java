package homeWork3;

public class InstructorManager  extends UserManager{
	
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.course + " baþarýlý þekilde eklendi");
	}
	public void removeCourse(Instructor instructor) {
		System.out.println(instructor.course + " baþarýlý þekilde silindi");
	}
	public void uptadeCourse(Instructor instructor) {
		System.out.println(instructor.course + " baþarýlý þekilde güncellendi");
	}
	

}
