import java.util.Scanner;

public class Fact{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,result;
        System.out.println("Enter a number to find factorial");
        a= sc.nextInt();
        result=fact(a);
        System.out.println("Factorial of "+a+" is "+result);
    }

    static int fact(int a){
        if(a==0 || a==1)
        return 1;
        else
        return(a*fact(a-1));
    }
}