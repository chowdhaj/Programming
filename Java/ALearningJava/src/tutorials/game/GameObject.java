package tutorials.game;

// This class is abstract because of the keyword 'abstract'. This prevents us from creating an instance of this object
public abstract class GameObject {
	
	private int x; // You can add private variables in an abstract class
	
	public void something () {
		// You can have regular old methods inside an abstract class
	}
	
	// Adding an abstract modifier allows you to use abstract methods and prevents you from creating an instance of that type

	// This is an abstract method
	public abstract void draw(); // We are not providing an implementation for this method - we defer it for other methods
	// Any class that inherits from the 'GameObject' class, must implement the 'draw()' method
	
	public static void main(String[] args) {
		
		// We cannot instantiate the type 'GameObject' because it is abstract
		//GameObject myObject = new GameObject(); // Abstract classes exist to be extended, they cannot be instantiated

		Player player = new Player(); // We can instantiate the 'Player' class because it is NOT abstract
		player.someMethod();
		//player.draw();
		
		Menu menu = new Menu();
		//menu.draw();
		
		GameObject[] gameObjects = new GameObject[2]; // Created an array of type GameObject and it holds 2 elements
		gameObjects[0] = player; // Element #0 holds player
		gameObjects[1] = menu; // Element #1 holds menu
		
		for (GameObject obj : gameObjects) {
			obj.draw();
		}
	}
}
