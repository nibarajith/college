import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,a=0,b=1,c;
        System.out.print("Enter the limit: ");
        n= sc.nextInt();
        System.out.println("Fibonacci Series: \n");
        System.out.print(a+" "+b);
        for(int i=2;i<=n;i++){
            c=a+b;
            System.out.print(" "+c+" ");
            a=b;
            b=c;
        }
            
    }
}