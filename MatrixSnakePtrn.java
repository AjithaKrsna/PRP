package Problems;
import java.util.*;
public class MatrixSnakePtrn {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n*n matrix rows : ");
		int n=sc.nextInt();
		int count=1;
		int mat[][]=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				mat[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			if(count%2!=0){
			for(int j=n-1;j>=0;j--){
				System.out.print(mat[i][j]+" ");
			}count++;
			}
			else{
				for(int j=0;j<n;j++){
					System.out.print(mat[i][j]+" ");
				}
				count++;
			}
		}
	}

}
