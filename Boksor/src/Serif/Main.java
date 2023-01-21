package Serif;

public class Main {

	public static void main(String[] args) {
		Fighter f1=new Fighter("A", 12, 120, 95, 55);
		Fighter f2=new Fighter("B", 15, 85, 90, 20);
		
		Match match=new Match(f1, f2, 90, 95);
		match.run();
	}

}
