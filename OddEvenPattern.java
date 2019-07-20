package Problems;
import java.util.*;
public class OddEvenPattern{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int even=0, odd=0;
		int arr[]=new int[len];
		for(int i=0;i<len;i++){
			arr[i]=sc.nextInt();
			if(arr[i]%2==0){
				even++;
			}
			else{
				odd++;
			}
		}
		int e1[]=new int[even];
		int o1[]=new int[odd];
		int j=0,k=0;
		Arrays.sort(arr);
		for(int i=0;i<len;i++){
			if(arr[i]%2!=0){
				o1[j]=arr[i];
				j++;
			}
			else{
				e1[k]=arr[i];
				k++;
			}
		}
		for(int i=0;i<o1.length || i< e1.length;i++){
			if(o1[0]>e1[0]){
				
					//System.out.print(e1[i]+" "+o1[i]+" ");
					//continue oo;
					if(i<e1.length){
						System.out.print(e1[i]+" ");
					}
					if(i<o1.length){
						System.out.print(o1[i]+" ");
					}
			}	
			else {
			
				if(i<o1.length){
					System.out.print(o1[i]+" ");
				}
				if(i<e1.length){
					System.out.print(e1[i]+" ");
				}
			}
		}
	}

}
