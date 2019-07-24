package Problems;
import java.util.*;
public class RevStringWithSpaces {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		StringBuilder s1=new StringBuilder(sc.nextLine());
		String s=s1.toString();
		char ch[]=s.toCharArray();
		
		s1= new StringBuilder(s1.reverse().toString().replaceAll("\\s", ""));
		String s2=s1.toString();
		char ch2[]=s2.toCharArray();
		int count=0;
		
		for(int i=0;i<ch.length;i++){
			if(ch[i]==' '){
				System.out.print(' ');
				count++;
			}
			else{
				System.out.print(ch2[i-count]);
			}
		}
	}

}
