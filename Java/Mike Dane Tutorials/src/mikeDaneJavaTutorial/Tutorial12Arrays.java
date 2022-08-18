/*
 * * * * *
 * NOTES *
 * * * * *
 * An array is a special structure that stores lots of data of the same type
 * A variable stores a single value, but an array can store multiple values
 * The indexing for arrays starts at 0
 * Individual elements in an array are accessed like this: array[n] - where 'n' is an index in the array
 * Arrays are a fixed length
 */

// ARRAYS //
package mikeDaneJavaTutorial;

public class Tutorial12Arrays {
	
	public static void main(String[] args) {
	
		// Create an array of Strings called 'friends' with a length of 4
		String[] friends = {"Jim", "Karen", "Kevin", "Josh"};
		
		// Printing the array like this prints the address of the array in memory, not the contents of the array
		System.out.println(friends); 
		System.out.println(friends[0]); // Prints the first element in the array
		System.out.println(friends.length); // Prints the length of the array
		
		// Changes the first element of the array to "Mike"
		friends[0] = "Mike"; 
		System.out.println(friends[0]); // Prints the first element in the (updated) array
		
		// Creates an array of Strings called 'moreFriends' with a length of 5
		String[] moreFriends = new String[5];
		moreFriends[0] = "Mike"; // Adds Mike to the 0th index
		moreFriends[1] = "Jim"; // Adds Jim to the 1st index
		moreFriends[2] = "Tom"; // Adds Tom to the 2nd index
		moreFriends[3] = "John"; // Adds John to the 3rd index
		moreFriends[4] = "Lee"; // Adds Lee to the 4th index
	}
}