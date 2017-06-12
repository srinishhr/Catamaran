import java.util.*;

public class Question1 {
		
	public static void printSequence(int X){
		List<Fraction> list = new ArrayList<Fraction>();
		
		for(int i=X;i>1;i--){
			for(int j=1;j<i;j++){
				Fraction fraction = new Fraction(j,i);
				boolean bool = list.contains(fraction);
				if(!list.contains(fraction))
					list.add(fraction);
			}
		}

		list.add(new Fraction(0,1));
		list.add(new Fraction(1,1));
		Collections.sort(list);
		System.out.println(list);

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int x = sc.nextInt();
		int x=7;
		printSequence(x);
		//printSequence(4);
		//printSequence(5);
		
	}

}
