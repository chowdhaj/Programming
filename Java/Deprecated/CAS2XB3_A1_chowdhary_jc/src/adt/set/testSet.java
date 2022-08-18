/*  Student Information
 *  -------------------
 *  Student Name: Chowdhary, Jatin
 *  Student Number: 400033011
 *  Course Code: CS/SE 2XB3
 *  Lab Section: 02
 *  I attest that the following code being submitted is my own individual work. 
 */
package adt.set;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Jatin [TBE] Chowdhary
 *
 */
public class testSet {
	
	public static final int TEST_CASES = 16;

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Set a = new Set(new String[] {"a","b","c","d","e","f","g","h","i","j","w"});
		Set b = new Set(new String[] {"j","i","h","g","f","e","d","c","b","a","x"});
		Set c = new Set(new String[] {"y","o","g","a","f","h","x","d","b","j","z"});
		Set d = new Set(new String[] {"h","d","w","e","n","u","v","s","g","x","c"});
		Set e = new Set(new String[] {"1","2","3","4","5","6","7","8","e","r","t"});
		
		Set f = new Set(new String[] {"1","2","3","4","5","6","0"});
		Set g = new Set(new String[] {"z","x","c","v","b"});
		Set h = new Set(new String[] {"y","u","i","o","g"});
		Set i = new Set(new String[] {"2","3","4","5","a","s","d"});
		Set j = new Set(new String[] {"q","w","e","r","t","y"});
		
		FileWriter file   = new FileWriter("output.txt");
		PrintWriter write = new PrintWriter(file);
		
		write.println("Test Case: UNION");
		write.println("Trial 1: ");
		write.println("\t"+ f + " UNION " + g);
		write.println("\t EXPECTED : {1,2,3,4,5,6,0,z,x,c,v,b}");
		write.println("\t ACTUAL   : " + f.union(g));
		
		write.println("Trial 2: ");
		write.println("\t"+ h + " UNION " + i);
		write.println("\t EXPECTED : {y,u,i,o,g,2,3,4,5,a,s,d}");
		write.println("\t ACTUAL   : " + h.union(i));
		
		write.println("Trial 3: ");
		write.println("\t"+ f + " UNION " + e);
		write.println("\t EXPECTED : {1,2,3,4,5,6,0,7,8,e,r,t}");
		write.println("\t ACTUAL   : " + f.union(e));
		
		write.println();
		
		write.println("\nTest Case: INTERSECTION");
		write.println("Trial 4: ");
		write.println("\t"+ f + " INTERSECTION " + g);
		write.println("\t EXPECTED : {}");
		write.println("\t ACTUAL   : " + f.intersection(g));
		
		write.println("Trial 5: ");
		write.println("\t"+ e + " INTERSECTION " + i);
		write.println("\t EXPECTED : {2,3,4,5}");
		write.println("\t ACTUAL   : " + e.intersection(i));
		
		write.println("Trial 6: ");
		write.println("\t"+ a + " INTERSECTION " + b);
		write.println("\t EXPECTED : {a,b,c,d,e,f,g,h,i,j}");
		write.println("\t ACTUAL   : " + a.intersection(b));

		write.println("");
		
		write.println("\nTest Case: DIFFERENCE");
		write.println("Trial 7: ");
		write.println("\t"+ f + " DIFFERENCE " + g);
		write.println("\t EXPECTED : {0,1,2,3,4,5,6}");
		write.println("\t ACTUAL   : " + f.difference(g));
		
		write.println("Trial 8: ");
		write.println("\t"+ c + " DIFFERENCE " + d);
		write.println("\t EXPECTED : {y,o,a,f,b,j,z}");
		write.println("\t ACTUAL   : " + c.difference(d));
		
		write.println("Trial 9: ");
		write.println("\t"+ e + " DIFFERENCE " + f);
		write.println("\t EXPECTED : {7,8,e,r,t}");
		write.println("\t ACTUAL   : " + e.difference(f));
		
		write.println("\nTest Case: IS_EQUAL");
		write.println("Trial 10: ");
		write.println("\t"+ e + " IS_EQUAL " + f);
		write.println("\t EXPECTED : false");
		write.println("\t ACTUAL   : " + e.isEqual(f));
		
		write.println("Trial 11: ");
		write.println("\t"+ b + " IS_EQUAL " + g);
		write.println("\t EXPECTED : false");
		write.println("\t ACTUAL   : " + b.isEqual(g));
		
		write.println("Trial 12: ");
		write.println("\t"+ a + " IS_EQUAL " + c);
		write.println("\t EXPECTED : false");
		write.println("\t ACTUAL   : " + a.isEqual(c));
		
		write.println("\nTest Case: IS_SUBSET");
		write.println("Trial 13: ");
		write.println("\t"+ e + " IS_SUBSET " + f);
		write.println("\t EXPECTED : false");
		write.println("\t ACTUAL   : " + e.isSubset(f));
		
		write.println("Trial 14: ");
		write.println("\t"+ b + " IS_SUBSET " + g);
		write.println("\t EXPECTED : false");
		write.println("\t ACTUAL   : " + b.isSubset(g));
		
		write.println("Trial 15: ");
		write.println("\t"+ a + " IS_SUBSET " + c);
		write.println("\t EXPECTED : false");
		write.println("\t ACTUAL   : " + a.isSubset(c));
		
		write.println("\nTest Case: GET_COUNT");
		write.println("Trial 16: ");
		write.println("\t"+ e + " is " + e.getCount() + " characters long");
		write.println("\t EXPECTED : 11");
		write.println("\t ACTUAL   : " + e.getCount());
		
		write.println("Trial 17: ");
		write.println("\t"+ a + " is " + a.getCount() + " characters long");
		write.println("\t EXPECTED : 11");
		write.println("\t ACTUAL   : " + a.getCount());
		
		write.println("Trial 18: ");
		write.println("\t"+ i + " is " + i.getCount() + " characters long");
		write.println("\t EXPECTED : 7");
		write.println("\t ACTUAL   : " + i.getCount());
		
		
		write.println("\nTest Case: TO_STRING");
		write.println("Trial 19: ");
		write.println("\t EXPECTED : {y,u,i,o,g}");
		write.println("\t ACTUAL   : " + h);
		
		write.println("Trial 20: ");
		write.println("\t EXPECTED : {y,o,g,a,f,h,x,d,b,j,z}");
		write.println("\t ACTUAL   : " + c);
		
		write.println("Trial 21: ");
		write.println("\t EXPECTED : {1,2,3,4,5,6,0}");
		write.println("\t ACTUAL   : " + f);
		
		write.close();
		
	}
}

/*

		Scanner input = new Scanner(new File("input.txt"));
		input.nextLine(); 
		Set[] sets = new Set[TEST_CASES];
		String[] units = new String[SetFunctions.MAX_SIZE];
		String clean = "";
		
		for(int n = 0; input.hasNextLine(); n++) {
			int index = 0;
			clean = input.nextLine();
			clean = clean.replace(",", "");
			//System.out.println("#" + clean.length());
			for(int i = 0; i < clean.length(); i++) {
				//System.out.print(clean.charAt(i) + " ");
				units[i] = String.valueOf(clean.charAt(i));
			}
			//SetFunctions.printSingleArray(units);
			for(int j = 0; j < sets.length; j++) {
				sets[j] = new Set(units);
			}
			System.out.println();
		}
		

			for(int i = 0; i < inputSet.length; i++) {
			while(input.hasNext()) {
				for(int j = 0; j < inputSet[i].length; j++) {
					try {
						System.out.println(input.next());
					} catch (Exception NoSuchElementException) {
						break;
					}
					
				}
			}
		}
		

		for(int n = 0; input.hasNextLine(); n++) {
			int index = 0;
			clean = input.nextLine();
			clean = clean.replace(",", "");
			//System.out.println(clean);
			for(int i = 0; i < clean.length(); i++) {
				System.out.println(clean.charAt(i));
				//inputSet[0][i] = String.valueOf(clean.charAt(i));
			}
			break; 
		}
		
		for(int i = 0; i < inputSet[i].length; i++){
			if (inputSet[0][i] != null) {
				System.out.print(inputSet[0][i]);
			} else {
				break;
			}
		}
		
		input.close();
		
		

for (int n = 0; input.hasNextLine(); n++) {
			temp += input.nextLine();
			temp = temp.replaceAll(",", "");
			for(int i = 0; i < temp.length(); i++) {
				arr[i] = String.valueOf(temp.charAt(i)); 
			}
			inputSet[n] = arr;
			break; 
		}


for(int i = 0; i < inputSet.length; i++) {
			for(int j = 0; j < inputSet[i].length; j++) {
				System.out.print(inputSet[i][j]);
			}
			System.out.println();
		}

		String[] setA = new String[SetFunctions.MAX_SIZE];
		for (int i = 0; i < inputSet.length; i++) {
			for(int j = 0; j < inputSet[i].length(); j++) {
				setA[j] = inputSet[j];
				
			}
			
		}
		
		SetFunctions.printSingleArray(setA);

 
 */ 
