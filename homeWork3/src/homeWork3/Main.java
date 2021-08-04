package homeWork3;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student(1, "G�khan", "G�k", "engokhangok@gmail.com", "pasword", "Java HomeWork");
		Student student2 = new Student(2, "Reha", "Ozk�r�ehirli", "rehaozk�rsehirli@icloud.com", "pasword","C# HomeWork1");
		Student student3 = new Student(3, "Fatih", "G�k", "fatihgok@hotmail.com", "pasword",
				"Programlamaya giri� HomeWork");

		StudentManager studentManager = new StudentManager();

		Student[] students = { student1, student2, student3 };
		for (Student student : students) {
			studentManager.addCourse(student);
			studentManager.removeCourse(student);
			studentManager.updateStudent(student);
		}
		
		System.out.println("-------------------");
		Instructor instructor = new Instructor(10, "Engin", "Demiro�", "engindemirog@kodlama.io", "Pasword",
				"Yaz�l�m Geli�time Kurslar� ");
		System.out.println(instructor.getName() + " " + instructor.getLastName() + " " + instructor.course);
		
		
		System.out.println("-------------------");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor);
		
		instructorManager.removeCourse(instructor);

	}

}
