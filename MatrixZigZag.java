package Problems;
import java.util.*;
public class MatrixZigZag {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		int mat[][]=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				mat[i][j]=sc.nextInt();
			}
		}
		
	 	int i=0,j=n-1;
		System.out.print(mat[i][j]+" ");
		while(i!=(n-1) || j!=0){
		
			if(i==(n-1)){
				j--;
				System.out.print(mat[i][j]+" ");
				while(j!=0){
					i--;j--;
					System.out.print(mat[i][j]+" ");
				}
			}
			else if(j==(n-1) && i!=0){
				i++;
				System.out.print(mat[i][j]+" ");
				while(i!=0){
					i--; j--;
					System.out.print(mat[i][j]+" ");
				}
			}
			else if(i==0 && j!=0){
				j--;
				System.out.print(mat[i][j]+" ");
				while(j!=(n-1)){
					i++; j++;
					System.out.print(mat[i][j]+" ");
				}
			}
			else if(j==0){
				i++;
				System.out.print(mat[i][j]+" ");
				while(i!=(n-1)){
					i++; j++;
					System.out.print(mat[i][j]+" ");
				}
			}
			
		}
		
	}

}
