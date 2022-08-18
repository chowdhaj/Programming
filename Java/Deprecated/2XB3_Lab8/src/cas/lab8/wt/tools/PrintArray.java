package cas.lab8.wt.tools;

public class PrintArray {
	
	public static void printArray(Comparable[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < (array.length - 1)) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] array = {9,8,7,6,5,4,3,2,1,1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1,0};
		printArray(array);

	}

}
