package Serif;

public class Teacher {
	String name;
	String mpno;
	String branch;
	
	public Teacher(String name, String mpno, String branch) {
		this.name=name;
		this.mpno=mpno;
		this.branch=branch;
	}
	void print() {
		System.out.println("Name:"+this.name);
		System.out.println("Phone:"+this.mpno);
		System.out.println("Branch:"+this.branch);
	}

}
