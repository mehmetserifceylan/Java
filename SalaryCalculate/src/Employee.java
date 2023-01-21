
public class Employee {
	String name;
	int salary;
	int workHours;
	int hireYear;
	
	Employee(String name, int salary, int workHours, int hireYear) {
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	double tax(Employee e1) {
		if(e1.salary<1000) {
			return 0.0;
		}
		return (e1.salary)*0.03;
	}
	double bonus(Employee e1) {
		if(e1.workHours<=40) {
			return 0;
		}
		return (e1.workHours-40)*30;
	}
	double raiseSalary(Employee e1) {
		if(2021-e1.hireYear<10) {
			return e1.salary*0.05;
		}else if(2021-e1.hireYear>=10 && 2021-e1.hireYear<20){
			return e1.salary*0.1;
		}else {
			return e1.salary*0.15;
		}
	}
	@Override
	public String toString() {
		return "Adı:"+this.name+"\n"
				+"Maasi:"+this.salary+"\n"
				+"Calisma Saati:"+this.workHours+"\n"
				+"Baslangic Yili:"+this.hireYear+"\n"
				+"Vergi:"+this.tax(this)+"\n"
				+"Bonus:"+this.bonus(this)+"\n"
				+"Maas Artisi:"+this.raiseSalary(this)+"\n"
				+"Vergi ve Bonuslar ile birlikte maas:"+(this.salary-this.tax(this)+this.bonus(this))+"\n"
				+"Toplam maas:"+(this.salary+this.raiseSalary(this));
	}
}
