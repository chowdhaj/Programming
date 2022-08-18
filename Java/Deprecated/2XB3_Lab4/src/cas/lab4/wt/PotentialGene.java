package cas.lab4.wt;

public class PotentialGene {

	public static boolean isPotentialGene(String dna) {

		boolean status = true;
		
		// Convert entire sequence to uppercase
		dna = dna.toUpperCase();

		// DNA length is a multiple of 3
		if (dna.length() % 3 != 0) return false;

		// DNA length starts with "ATG"
		if (!(dna.startsWith("ATG"))) return false;
		
		// Only contains 'A', or 'T', or 'G' or 'C'
		for (char base : dna.toCharArray()) {
			if ((base == 'A') || (base == 'T') || (base == 'G') || (base == 'C')) {
				continue;
			} else {
				return false;
			}
		}

		// TAA is not in middle
		if (dna.indexOf("TAA") != (dna.length() - 3) && ((dna.indexOf("TAA")) != -1)) return false;
		// TAG is not in middle
		if (dna.indexOf("TAG") != (dna.length() - 3) && ((dna.indexOf("TAG")) != -1)) return false;
		// TGA is not in middle
		if (dna.indexOf("TGA") != (dna.length() - 3) && ((dna.indexOf("TGA")) != -1)) return false;	
		
		// Correct stop codon is present
		if ((dna.endsWith("TAA")) || (dna.endsWith("TAG")) || (dna.endsWith("TGA"))) return true;
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (String dna : args) {
			System.out.println(dna + ": " + isPotentialGene(dna));
		}
	}
}

/* 
 * Determines whether a a DNA string corresponds to a
 *     potential gene length is a multiple of 3 starts with the start codon (ATG)
 *     ends with a stop codon (TAA or TAG or TGA) has no intervening stop
 *     codons(i.e. a stop codon cannot be in the middle of the string)
 */