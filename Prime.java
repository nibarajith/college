import java.util.Scanner;

public class Prime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,count=0;
		System.out.print("Enter a number to check whether it is prime or not");
		a=sc.nextInt();
		for(int i=1;i<=a;i++){
			if(a%i==0)
			count++;
		}
		if(count!=2)
		System.out.println("It is not a prime");
		else
		System.out.println("It is a prime");
		
		
		
	}
}