package day48_Method_OverRiding;

class Mahribana{
	void methodA() {
		System.out.println("Method A");
	}
	public String methodB() {
		return "B";
	}
	
	protected double Salary(double bonus) {
		return bonus+100000;
	}
}

public class AccessModifiers extends Mahribana {
	
	
	@Override
	void methodA() {
		System.out.println("Method A");
	}
	@Override
	public String methodB() {
      return "C";
}
	protected double Salary(double bonus) {
		return bonus+20000;
	}
	
}
