package Class11;

public class Dog {
	
	//State
	//attributes // properties/ fields
	String name;
	String color;
	String breed;
	Double weight;
	int age;
	// These are the behaviors of a dog
	//Methods functions
	void bark() {
		System.out.println("Barking.......");
	}
	
	void sleep() {
		System.out.println("Dog is sleeping......");
	}
	
	public static void main(String[] args) {
		// creating objects from a class
		Dog dog1= new Dog();
		// calling a behavior of an object
		dog1.bark();
		dog1.sleep();
	}

}
