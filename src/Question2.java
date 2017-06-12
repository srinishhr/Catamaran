import java.util.Scanner;

public class Question2 {

	public static void NoOfDigits(double N){
		int count = 0;
		
		// no need of finding divisors of numbers whose value is between 0 and 10		 
		if(N<10){
			System.out.println("No of digits--->1");
		}
		
		//find divisors of N in reverse order
		for(int i=9;i>1;i--){			
			while(N%i == 0){
				N = N/i;
				count++;
			}
		}
		
		if(N>10){
			System.out.println("NOT Possible --> -1");
		}
		else{
			System.out.println("No of Digits --> "+count);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = 10000000000000.0;
		NoOfDigits(N);

	}

}
