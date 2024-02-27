import java.util.*;

public class Strtoarr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a;
		System.out.println("Enter a sequence of number with space :");
		a=sc.nextLine();
		String[] arr=a.split(" ");
		for(String i: arr){
			System.out.print("\t"+i);
		}
	
		
		
	}
}