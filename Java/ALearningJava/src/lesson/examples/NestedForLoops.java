package lesson.examples; // Location of our class file

public class NestedForLoops {

    public static void main(String[] args) {
    
        for (int i = 0; i <= 9; i++) { // This for loop tests whether 'i' is less than or equal to 9
            for (int j = 0; j <= 9; j++) { // This for loop tests whether 'j' is less than or equal to 9
                System.out.printf("[%d,%d]",i,j); // Prints out the values of 'i' and 'j' to console
            }
            System.out.println(); // Functions as a "\n"
        }
    }
}

/*
					OUTPUT
		
[0,0][0,1][0,2][0,3][0,4][0,5][0,6][0,7][0,8][0,9]
[1,0][1,1][1,2][1,3][1,4][1,5][1,6][1,7][1,8][1,9]
[2,0][2,1][2,2][2,3][2,4][2,5][2,6][2,7][2,8][2,9]
[3,0][3,1][3,2][3,3][3,4][3,5][3,6][3,7][3,8][3,9]
[4,0][4,1][4,2][4,3][4,4][4,5][4,6][4,7][4,8][4,9]
[5,0][5,1][5,2][5,3][5,4][5,5][5,6][5,7][5,8][5,9]
[6,0][6,1][6,2][6,3][6,4][6,5][6,6][6,7][6,8][6,9]
[7,0][7,1][7,2][7,3][7,4][7,5][7,6][7,7][7,8][7,9]
[8,0][8,1][8,2][8,3][8,4][8,5][8,6][8,7][8,8][8,9]
[9,0][9,1][9,2][9,3][9,4][9,5][9,6][9,7][9,8][9,9]
 ^[i]		 ^[j]		  ^[i]		  ^[j]
 
[i] - The ascending 0, 1, 2, 3, 4, 5, 6, 7, 8, 9's are printed out by 'i'
[j] - The constant stream of 0, 1, 2, 3, 4, 5, 6, 7, 8, 8 are printed out by 'j'

*/
