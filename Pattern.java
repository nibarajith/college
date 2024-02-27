import java.util.Scanner;

public class Pattern{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Enter the number of rows for pyramid pattern: ");
		a = sc.nextInt();
		for(int i=1;i<=a;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}