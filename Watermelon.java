import java.util.Scanner;

public class Watermelon {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int wt=sc.nextInt();
		if(wt<=100){
			if(wt%2==0){
				if((wt/2)%2==0){
					System.out.println("yes");
				}
				else{
					System.out.println((wt/2+1)+" "+(wt/2-1));
				}
			}
			else{
				System.out.println("no");
			}
			
		}
		else{
			System.out.println("Invalid");
		}
	}

}
