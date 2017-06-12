import java.util.*;
public class Question3 {

	public static void printSequence(long nr, long dr){	
		if(nr==0||dr==0){
			System.out.print("Invalid!!");return;
		}				
		
		if(dr%nr == 0){
			System.out.println("1/"+(dr/nr));
			return;
		}		
		long remainder = (dr/nr)+1;
		if(remainder%2 == 0)
			remainder +=1;		
		System.out.print("1/"+remainder+" + ");
		//find similar unit fraction for remainder obtained above	
		printSequence((nr*remainder-dr),(dr*remainder));
				
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//long nr = sc.nextLong();
		//long dr = sc.nextLong();
		
		long nr=23, dr=111;/*
		printSequence(nr, dr);
		System.out.println();
		nr=5; dr=27;
		printSequence(nr, dr);
		nr=5; dr=47;
		printSequence(nr, dr);*/

		//nr=5; dr=51;
		printSequence(nr, dr);

		

	}

}
