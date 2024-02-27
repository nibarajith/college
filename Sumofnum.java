import java.util.Scanner;

public class Sumofnum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,result=0;
        System.out.print("Enter a number to add it's digits: ");
        a= sc.nextInt();
        while(a!=0){
            int rem = a%10;
            result = result + rem;
            a=a/10;
        }
        System.out.print("Sum of the digits of the given number is: "+result);
    }
}