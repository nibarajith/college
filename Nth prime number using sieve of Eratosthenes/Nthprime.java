import java.util.*;
public class Nthprime
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		boolean Isprime[] = new boolean[100005];
		Arrays.fill(Isprime,true);
		for(int i = 2;i*i<=Isprime.length-1;i++){
		    if(Isprime[i]==true){
		        for(int j=i*i;j<=Isprime.length-1;j+=i){
		            Isprime[j] = false;
		        }
		    }
		}
		for(int i = 2;i<=Isprime.length-1;i++){
		    if(Isprime[i]==true){
		        if(count==n){
		            System.out.println(i);
		        }
		        count++;
		    }
		}
	}
}
