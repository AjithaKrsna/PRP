package FlowCtrls;
import java.util.*;
public class SumOfDigits {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m,sum=0;
		while(n!=0){
			m=n%10;
			n=n/10;
			sum=sum+m;
		}
		System.out.println(sum);
	}

}
