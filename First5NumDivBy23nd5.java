package FlowCtrls;
import java.util.*;
public class First5NumDivBy23nd5{
	public static void main(String args[]){
		int count=1;
		for(int i=1;count<=5;i++){
			if(i%2==0 && i%3==0 && i%5==0){
				System.out.print(i+" ");
				count++;
			}
		}
	}

}
