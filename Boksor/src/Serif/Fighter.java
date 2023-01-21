package Serif;

public class Fighter {
	String name;
	int damage;
	int health;
	int weight;
	int dodge;
	int raund=1;
	
	public Fighter(String name, int damage, int health, int weight, int dodge) {
		this.name=name;
		this.damage=damage;
		this.health=health;
		this.weight=weight;
		this.dodge=dodge;
	}
	int hit(Fighter feo) {
		if(feo.isDodge()) {
			System.out.println(feo.name+" gelen hasari blokladi!");
			return feo.health;
		}
		if(feo.health-this.damage<0) {
			return 0;
		}
		System.out.println(this.name+"=>"+feo.name+" "+this.damage+"hasar vurdu.");
		return feo.health-this.damage;
	}
	boolean isDodge() {
		double randomNumber=Math.random()*100;
		return this.dodge>=randomNumber;
	}
	
}
