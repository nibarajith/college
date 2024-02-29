import java.util.*;
import java.io.*;

public class ReducedSubtraction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for Reduced subtraction: ");
        int a=sc.nextInt();
        int result=RS(a);
        System.out.println("Reduced Subtraction = "+result);
    }

    static int RS(int a){
        while(a>=10){
            int x=a;
            int l=0;

            while(a>0){
                a=a/10;
                l++;
            }
            int arr[] = new int[l];
            int i =l-1;

            while(x>0){
                arr[i]=x%10;
                x=x/10;
                i--;
            }

            for(int j=0;j<l-1;j++){
                a=a*10+Math.abs(arr[j]-arr[j+1]);
            }
        }
        return a;
    }
}