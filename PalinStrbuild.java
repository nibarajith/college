import java.util.Scanner;

public class PalinStrbuild{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.print("Enter a string to check whether it is palindrome or not: ");
        a= sc.nextLine();
        StringBuilder sb= new StringBuilder(a);
        String result=sb.reverse().toString();
        if(a.equals(result))
        System.out.println("It is a palindrome");
        else
        System.out.println("It is not a palindrome");        
    }
}