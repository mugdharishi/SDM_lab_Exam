import java.util.Scanner;

public class GreaterNumber {
	
	public static int ReturnGreater(int first, int second) {
		if(first>=second)		
			return first;
		else 
			return second;		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first, second;
		
		System.out.println("Enter 2 numbers : ");
		System.out.println("1st number : ");
		first=sc.nextInt();
		System.out.println("2nd number : ");
		second=sc.nextInt();
		
		int greater=ReturnGreater(first,second);
		System.out.println("Greater number is : "+greater);
	}
}