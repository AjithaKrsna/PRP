package Problems;
import java.util.*;
public class EncryptionStringBased {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();
		char c1=sc.next().charAt(0);
		char arrU[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char arrL[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int key = 0;
		char c2[]=new char[ch.length];
		for(int i=0;i<ch.length;i++){
			if(c1==arrU[i] || c1==arrL[i]){
				key=i+1;
				break;
			}
		}
		//System.out.println("Key"+ key);
		int n=0;
		for(int i=0;i<ch.length-1;i++){
			for(int j=0;j<26;j++){
				if(ch[i]==arrU[j] || ch[i]==arrL[j]){
					n=(j+1)-key;
					//System.out.println("n="+n);
					if(n<=0){
						n=n+26;
						//System.out.println("-ve n="+ n);
					}
					if(ch[i]==Character.toUpperCase(ch[i])){
						c2[i]=arrU[n-1];
					}
					if(ch[i]==Character.toLowerCase(ch[i])){
						c2[i]=arrL[n-1];
					}
				}
			}
		}
		c2[ch.length-1]=ch[ch.length-1];
		
		String s2=new String(c2);
		System.out.println(s2);
	}

}
