import java.util.*;
public class ArrayFreq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]= new int[size];
        int visited=-1;
        int fr[]= new int[arr.length];
        System.out.println("Enter array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println("");
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    fr[j]=visited;
                }
             }
            if(fr[i]!= visited){
                fr[i]=count;
            }
        }
        System.out.println("Element \t Frequency");
        for(int i=0;i<arr.length;i++){
            if(fr[i]!=visited)
            System.out.println(arr[i]+"\t\t"+fr[i]);
        }

        System.out.println("Displaying duplicates:");
        for(int i=0;i<arr.length;i++){
            if(fr[i]!=visited && fr[i]>1)
            System.out.println(arr[i]+"\t"+fr[i]);
        }

        System.out.println("Displaying uniques");
        for(int i=0;i<arr.length;i++){
            if(fr[i]!=visited && fr[i]==1)
            System.out.println(arr[i]+"\t"+fr[i]);
        }
     }
} 