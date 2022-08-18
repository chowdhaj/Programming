package cas.lab2.wt.questions;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double G = 6.67E-11; // gravitational constant
		double mass1 = 5.98E24; // mass of earth
		double mass2 = 7.40E22; // mass of moon
		double r = 3.80E8; // distance between both bodies
		
		double force = G * mass1 * mass2 / r * r;
		System.out.println(force);
		
		/*
		 * The problem with the above is that there are no
		 * parenthesis or brackets. And since division has
		 * higher precedence than multiplication, 'mass2 / r' is
		 * performed first. This is wrong because the first 
		 * computation should be 'G * mass1 * mass2', and then
		 * the whole thing is divided by 'r * r'. The correct
		 * way to do this is below:
		 */
		
		double forceCorrected = (G * mass1 * mass2) / (r * r);
		System.out.println(forceCorrected);
		
	}

}
