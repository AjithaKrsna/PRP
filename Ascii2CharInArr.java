package Arrays;
import java.util.*;
public class Ascii2CharInArr{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num of elements ");
		int n=sc.nextInt();
		char ch=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++){
			ch=(char)arr[i];
			System.out.print(ch+" ");
		}
		
	}

}
