package homeWork3;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student(1, "Gökhan", "Gök", "engokhangok@gmail.com", "pasword", "Java HomeWork");
		Student student2 = new Student(2, "Reha", "Ozkýrþehirli", "rehaozkýrsehirli@icloud.com", "pasword","C# HomeWork1");
		Student student3 = new Student(3, "Fatih", "Gök", "fatihgok@hotmail.com", "pasword",
				"Programlamaya giriþ HomeWork");

		StudentManager studentManager = new StudentManager();

		Student[] students = { student1, student2, student3 };
		for (Student student : students) {
			studentManager.addCourse(student);
			studentManager.removeCourse(student);
			studentManager.updateStudent(student);
		}
		
		System.out.println("-------------------");
		Instructor instructor = new Instructor(10, "Engin", "Demiroð", "engindemirog@kodlama.io", "Pasword",
				"Yazýlým Geliþtime Kurslarý ");
		System.out.println(instructor.getName() + " " + instructor.getLastName() + " " + instructor.course);
		
		
		System.out.println("-------------------");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor);
		
		instructorManager.removeCourse(instructor);

	}

}
