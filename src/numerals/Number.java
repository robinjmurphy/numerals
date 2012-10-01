package numerals;

public class Number {
	
	int number;
	private static int[] specialValues = { 100, 50, 10, 9, 5, 4, 1 };
	private static String[] specialSymbols = { "C", "L", "X", "IX", "V", "IV", "I" };

	/**
	 * Constructor
	 */
	public Number(int number) {
		this.number = number;
	}
	
	/**
	 * Conversion to Roman numerals
	 */
	public String toRoman() {
	String output = "";
	  int remaining = this.number;
	  for (int i = 0; i < specialValues.length; i++) {
	    while (remaining >= specialValues[i]) {
	      output = output.concat(specialSymbols[i]);
	      remaining -= specialValues[i];
	    }
	  }
	  return output;
	}

}
