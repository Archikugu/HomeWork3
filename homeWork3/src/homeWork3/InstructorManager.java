package homeWork3;

public class InstructorManager  extends UserManager{
	
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.course + " ba�ar�l� �ekilde eklendi");
	}
	public void removeCourse(Instructor instructor) {
		System.out.println(instructor.course + " ba�ar�l� �ekilde silindi");
	}
	public void uptadeCourse(Instructor instructor) {
		System.out.println(instructor.course + " ba�ar�l� �ekilde g�ncellendi");
	}
	

}
