import java.util.*;

public class MatrixMul{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int row1,row2,col1,col2,sum=0;
        System.out.println("Enter dimension for first matrix: ");
        row1=sc.nextInt();
        col1=sc.nextInt();
        System.out.println("Enter dimension for second matrix: ");
        row2=sc.nextInt();
        col2=sc.nextInt();
        int arr1[][]=new int[row1][col1];
        int arr2[][]=new int[row2][col2];
        int result[][]=new int[row1][col2];
        if(col1==row2){
            System.out.println("Enter elements of first matrix");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    arr1[i][j]=sc.nextInt();
                }
            }    
            System.out.println("Enter elements of second matrix");
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    arr2[i][j]=sc.nextInt();
                }

            }
            System.out.println("Multiplying matrices");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    for(int k=0;k<row2;k++){
                        sum+=arr1[i][k]*arr2[k][j];
                    }
                    result[i][j]=sum;
                    sum=0;
                }

            }
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    System.out.print(" "+result[i][j]);
                }
                System.out.println();
            }
        }   
    }
}