package tutorials.basic;

public class Person {
	String name; // Instance variable // There is one string name, for every object that is created 
	int age;
	double height;
	// When a member or object is static, it becomes a member of the class itself, instead of an instance. You can test this out by...
	// ... adding static to 'int age' above.
	// In other words, when you make something static, only ONE instance of that exists. So if you change it, you change it everywhere
	
	// This is how we create our own constructor. It's much like a method but there is no return type
	// Whatever is inside 'Person()' will run
	public Person(String name) {
		// Use the word 'this' to refer to the object created inside the class
		this.name = name; 
		// 'this.name' refers to our instance variable name [look above] && 'name' refers to our String name that is being passed as a parameter
		System.out.println("Person Created");
	}

	// Generate Getters And Setters By Clicking [Source > Generate Getters and Setters]
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void sayHelloTo(Person person) {
		// TODO Auto-generated method stub
		System.out.println(getName() + " said hello to " + person.getName() );
		
	}
	
}
