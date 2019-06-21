package FlowCtrls;
import java.util.*;
public class PalindromeOfANum {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int org=n;
		int rev=0;
		while(n!=0){
			int m=n%10;
			rev=rev * 10+m;
			n=n/10;
		}
		if(org==rev){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not palindrome");
		}
	}
}
