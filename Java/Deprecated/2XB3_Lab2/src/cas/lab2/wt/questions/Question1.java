package cas.lab2.wt.questions;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(2 + "bc");
		/*
		 * This outputs the following: 2bc
		 * This is because '2' is converted into a string
		 * and then "bc" is concatenated to the end of it. This 
		 * happens implicitly by the function using it. 
		 */
		
		System.out.println(2 + 3 + "bc");
		/*
		 * This outputs: 5bc
		 * This is because the '2' and '3' are ints. So, they are
		 * added, first. Also, addition is done from left to right.
		 * Hence, the result is 5. Then, "bc" is concatenated
		 * to the end of '5' because it gets converted
		 * into a string, implicitly by the function using it
		 */
		
		System.out.println((2 + 3) + "bc");
		/*
		 * This outputs: 5bc
		 * The reason for this is similar to the one above.
		 * First, the numbers '2' and '3' are added. The result 
		 * is 5. Then, '5' is casted to a String, and "bc" is 
		 * concatenated to the end of '5'
		 */
		
		System.out.println("bc" + (2 + 3));
		/*
		 * This outputs: bc5
		 * First, the numbers '2' and '3' are added together. This
		 * is because they are inside brackets. Brackets take 
		 * precedence over addition. The result is '5'. Then, 
		 * '5' is converted into a string and concatenated to
		 * the end of "bc". 
		 */
		
		System.out.println("bc" + 2 + 3);
		/*
		 * The output is: bc23
		 * This is because addition is performed from left to
		 * right. So, the first thing that happens is the addition
		 * of "bc" and '2'. But, '2' is converted into a String.
		 * Then it is concatenated to the end of "bc". The same
		 * procedure is performed for '3'. It is converted into a 
		 * String and then concatenated to the end of "bc2".
		 */	
	}
}
