package day49_Abstraction;

public abstract class Animal {
	public abstract void eat();
	
	public abstract void sleep();
	
	public static void main(String[] args) {
		
	}

}

class Cat extends Animal{
	
	@Override
	public void eat() {
		System.out.println("cat eats fish");
		
	}
	
	@Override
	public void sleep() {
		System.out.println("cat sleeps 14 hours");
		
	}
}

class Lion extends Animal{
	
	@Override
	public void eat() {
		System.out.println("Lion eats meat");
	}
	
	@Override
	public void sleep() {
		System.out.println("Lion sleeps 10 hours");
	}
}

class Test{
	public static void main(String[] args) {
		Lion obj= new Lion();
		obj.eat();
		obj.sleep();
		
		Cat obj2= new Cat();
		obj2.eat();
		obj2.sleep();
	}
}
