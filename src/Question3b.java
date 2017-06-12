import java.util.Scanner;

public class Question3b {

	public static int incrementVal = 1;//next 3, 5
	
	public static int counter = 0;
	
	public static void printSequence(long nr, long dr){	
		if(nr==0||dr==0){
			System.out.print("Invalid!!");return;
		}				
		counter++;
		if(dr%nr == 0){
			System.out.println("1/"+(dr/nr));
			return;
		}		
		long remainder = (dr/nr)+1;
		if(remainder%2 == 0){
//			remainder +=1;
			remainder +=incrementVal;	
		}
		System.out.print("1/"+remainder+" + ");
		
		//find similar unit fraction for remainder obtained above	
		printSequence((nr*remainder-dr),(dr*remainder));
				
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long nr,dr;
		//long nr = sc.nextLong();
		//long dr = sc.nextLong();
		nr=5; dr=51;
		printSequence(nr, dr);
		counter = 0;
		System.out.println(counter);
		
	}

}
