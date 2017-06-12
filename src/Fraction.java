import java.util.ArrayList;

class Fraction implements Comparable<Fraction> {

	private static final long serialVersionUID = 1L;
	public int nr,dr;
	public Fraction(int nr,int dr){
		if(dr!=0){
			
			int gcd = gcd(nr,dr);
			int newNr = nr/gcd;
			int newDr = dr/gcd;
			
			this.nr = newNr;
			this.dr = newDr;
		}
	}
	
	public static int gcd(int x, int y){
		 return (y == 0) ? x : gcd(y, x % y);
	}
			
	public int compareTo(Fraction fraction) {		
		float returnVal = ((float)this.nr/this.dr) - ((float)fraction.nr/fraction.dr);		
		return returnVal<0?-1:1;
	}
	
	public String toString() {
		//return "Fraction [nr=" + nr + ", dr=" + dr + "]";
		return nr+"/"+dr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dr;
		result = prime * result + nr;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraction other = (Fraction) obj;
		if (dr != other.dr)
			return false;
		if (nr != other.nr)
			return false;
		return true;
	}
	
	
	
}