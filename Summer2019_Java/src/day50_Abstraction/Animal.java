package day50_Abstraction;
/*
 WarmUp:
    create an Animal abstract class
            data/attributes: gender, age, color, name
            create one constructor that can set the gender, name, color and age
            Actions: Speak(), Eat(), Sleep(), Drink();
        create sub classes of the Animal and override those actions:
                    dog: Speak()    ==> woof
                         Sleep()    ==> 8 hours
                         Eat()      ==> KFC
                         Drinks()   ==> Milk Shake
                    Cat: Speak()    ==> meow
                         Sleep()    ==> 14 hours
                         Eat()      ==> m&m
                         Drinks()   ==> Hot chocolate
                    cow: Speak()    ==> moo
                         Sleep()    ==> 5 hours
                         Eat()      ==> grace
                         Drinks()   ==> Coffee with sugar
        create  zoo class and store some of those animals' objects
 */

public abstract class Animal {
	public String name;
	public int age;
	public char gender;
	public String color;
	public Animal(String name, char gender, int age, String color) {
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.color=color;
	}
	public abstract void Speak(String Language);
	public abstract void Sleep(int hours);
	public abstract void Eat(String food);
	public abstract void Drink(String liquid);
	
	public void getInfo() {
		System.out.println("Name is " +name);
		System.out.println("Gender is "+gender);
		System.out.println("Age is "+ age);
		System.out.println("Color is "+ color);
	}
	public static void main(String[] args) {
		
	}
	
		

}
class Dog extends Animal{
	public Dog(String name, char gender, int age, String color) {
		super(name, gender, age, color);
	}
	
	@Override
	public void Speak(String Language) {
		System.out.println(name+" speaks "+Language);
	}
	
	public void Sleep(int hours) {
		System.out.println(name+" sleeps "+hours+" hours");
	}
	
	public void Eat(String food) {
		System.out.println(name+" eats "+food);
	}
	
	public void Drink(String liquid) {
		System.out.println(name+" drinks "+liquid);
	}
	
}
abstract class Pig extends Animal{

	public Pig( String name, char gender, int age, String color) {
		super(name, gender, age, color);
		// TODO Auto-generated constructor stub
	}
	public abstract void Drunk();
}
class Cat extends Animal{
	public Cat(String name, char gender, int age, String color) {
		super(name, gender, age, color);
	}

	@Override
	public void Speak(String Language) {
		System.out.println(name+" speaks "+Language);
		
	}

	@Override
	public void Sleep(int hours) {
	   System.out.println(name+ "sleeps "+hours+" hours");
		
	}

	@Override
	public void Eat(String food) {
		System.out.println(name+" eats "+food);
	}

	@Override
	public void Drink(String liquid) {
		System.out.println(name+ " drinks "+liquid);
		
	}
}
class Cow extends Animal{
	public Cow(String name, char gender, int age, String color) {
		super(name, gender, age, color);
	}

	@Override
	public void Speak(String Language) {
		System.out.println(name+ " speaks "+Language);
		
	}

	@Override
	public void Sleep(int hours) {
		System.out.println(name+ " sleeps "+ hours+" hours");
		
	}

	@Override
	public void Eat(String food) {
		System.out.println(name+" eats "+food);
		
	}

	@Override
	public void Drink(String liquid) {
		System.out.println(name+" drinks "+liquid);
		
	}
	
}
class Zoo{
  public static void main(String[] args) {
	  
	Dog dogi= new Dog("Pasha", 'M', 2, "White");
	   dogi.getInfo();
	   
		dogi.Speak("woof");
		dogi.Sleep(8);
		dogi.Eat("salmon");
		dogi.Drink("water");
		System.out.println("=======================================");
	
	Cat catsi= new Cat("LadyBug", 'F', 1,"Black and White");
	   catsi.getInfo();
	   catsi.Speak("meow");
	   catsi.Sleep(14);
	   catsi.Drink("milk");
	   catsi.Eat("fish");
	   System.out.println("=========================================");
	  
	Cow cows= new Cow("Milkdud",'F',5,"grey");
	   cows.getInfo();
	   cows.Speak("moo");
	   cows.Sleep(5);
	   cows.Eat("grass");
	   cows.Drink("water");
	
		
	}
}
