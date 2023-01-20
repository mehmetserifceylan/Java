package Serif;

public class Main {

	public static void main(String[] args) {
		Course mat = new Course("Math", "MAT101", "MAT");
        Course fizik = new Course("Physics", "FZK101", "FZK");
        Course kimya = new Course("Chemical", "KMY101", "KMY");

        Teacher t1 = new Teacher("Ali", "90550000000", "MAT");
        Teacher t2 = new Teacher("Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Berk", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkCourseGrade(70,50,80);
        s1.isPass();

        Student s2 = new Student("Soner", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkCourseGrade(100,80,70);
        s2.isPass();

        Student s3 = new Student("Orhan", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(90,80,80);
        s3.addBulkCourseGrade(85,90,75);
        s3.isPass();

	}

}
