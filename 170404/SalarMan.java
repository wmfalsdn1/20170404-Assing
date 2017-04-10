public class SalaryMan {

	int salary = 1000000;
	public int getAnnualGross() {

		int bonus = salary*5;
		return salary*12 + bonus;

	}
	public SalaryMan(){
	
  }
	public SalaryMan(int salary) {

		this.salary = salary;
	}
	public static void main(String[] args) {

		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());

	}
}
