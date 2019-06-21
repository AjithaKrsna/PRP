package FlowCtrls;
import java.util.*;
public class PrimeOrNot {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		for(int i=2;i<=n;i++){
			if(n%i==0){
				count++;
				//break;
			}
		}
		if(count==2){
			System.out.println("Prime");
		}
		else{
			System.out.println("Composite");
		}
	}
}
