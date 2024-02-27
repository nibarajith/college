import java.util.Scanner;

public class Reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,result=0;
        System.out.println("Enter a number to reverse it");
        a= sc.nextInt();
        while(a!=0){
            int rem = a%10;
            result = result * 10 + rem;
            a=a/10;
        }
        System.out.println("Reversed number is "+result);
    }
}