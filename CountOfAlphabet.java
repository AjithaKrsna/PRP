package Problems;
import java.util.*;
public class CountOfAlphabet {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ch[]=s.toCharArray();
		//Arrays.sort(ch);
		int count=1;
		for(int i=0;i<ch.length-1;i++){
			if(ch[i]==ch[i+1]){
				count++;
			}
			else{
				System.out.print(ch[i]+""+count);
				count=1;
			}
		}
		System.out.print(ch[ch.length-1]+""+count);
	}

}
