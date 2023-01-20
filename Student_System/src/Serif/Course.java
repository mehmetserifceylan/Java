package Serif;

public class Course {
	Teacher courseTeacher;
	String name;
	String code;
	String prefix;
	int note;
	int courseGrade;
	
	public Course(String name,String code,String prefix) {
		this.name=name;
		this.code=code;
		this.prefix=prefix;
		this.note=0;
		this.courseGrade=0;
	}
	
	public void addTeacher(Teacher t) {
		if(this.prefix.equals(t.branch)) {
			this.courseTeacher=t;
			System.out.println("Progress success");
		}else {
			System.out.println(t.name+" Academician cannot teach this course.");
			
		}
	}
	public void printTeacher() {
		if(courseTeacher!=null) {
			System.out.println(this.name+" Course Acedemician:"+courseTeacher.name);
		}else {
			System.out.println(this.name+" academician has been assigned to the course.");
		}
	}
}
