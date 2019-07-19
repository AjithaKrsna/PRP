package Problems;
import java.util.*;
public class LeastFrequentDigitInArray {
	public static void main(String args[]) throws Exception{
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> input=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			input.add(sc.nextInt());
		}
		//System.out.println(input);
		int m=findKeyUsingLeastFrequentlyOccurringDigits(input);
		System.out.println("Key= "+m);
	}
	public static int countDigit(int n) 
    { 
        return (int)Math.floor(Math.log10(n) + 1); 
    } 
	
	public static int findKeyUsingLeastFrequentlyOccurringDigits (ArrayList<Integer> input) {
		int[] arr = new int[input.size()];
		int sum=0;
	    for (int i=0; i < arr.length; i++)
	    {
	        arr[i] = input.get(i).intValue();
	        sum=sum+countDigit(arr[i]);
	    }

	    int key1=0,key2=0,key3=0,key4=0,key5=0,key6=0,key7=0,key8=0,key9=0,key0=0;
	    for(int i=0;i<arr.length;i++){
	    	while(arr[i]>0){
	    		int n=arr[i] %10;
		    	switch(n){
		    	case 1: key1++; break;
		    	case 2: key2++; break;
		    	case 3: key3++; break;
		    	case 4: key4++; break;
		    	case 5: key5++; break;
		    	case 6: key6++; break;
		    	case 7: key7++; break;
		    	case 8: key8++; break;
		    	case 9: key9++; break;
		    	case 0: key0++; break;
		    	}
		    	arr[i]=arr[i]/10;
		    	
	    	}
	    }
	    	int a1[]={key0,key1,key2,key3,key4,key5,key6,key7,key8,key9};
	    	

	 int min=1;
	 int res=0;
	  for(int i=1;i<a1.length;i++){
		 
		  if(a1[i]==0){
			  continue;
		  }
			if(min>a1[i]){
				min=a1[i];
			}
		
	  }
	  for(int i=0;i<a1.length;i++){
		  if(min==a1[i]){
			  res+=i;
		  }
		  //System.out.println(res);
	  }
		return res;
	}

}
