import java.util.*;
public class OTPGenerator {
    public static String output1;
    public static void main(String args[]) {
     
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        long acntNo=sc.nextLong();
        String type=sc.next();
       
       userMethod(name,acntNo,type);
       System.out.println(output1);
        }

        public static void userMethod(String input1,long input2,String input3) {
        String a1=input3.substring(0,2);
        String str=Long.toString(input2);
       
        String a2=str.substring(0,1);
       
        long eg=input2;
        long egs=0,eg2=0;;
        for(long i=0;i<6;i++){
            eg=eg/10;
            if(i<5){
            eg2=eg%10;
            egs=egs+eg2;
            }
        }
        int sum=0;
        while (eg > 0 || sum > 9)  
        { 
            if (eg == 0) { 
                eg = sum; 
                sum = 0; 
            } 
            sum += eg % 10; 
            eg /= 10; 
        } 
       
        String a3=Integer.toString(sum);
        String a4=input1.substring(0,1);
        
        int sum1=0;
        while (egs > 0 || sum1 > 9)  
        { 
            if (egs == 0) { 
                egs = sum1; 
                sum1 = 0; 
            } 
            sum1 += egs % 10; 
            egs /= 10; 
        } 
       
        String a5=Integer.toString(sum1);
        String a6=input1.substring(input1.length()-1,input1.length());
        long a7=input2%10;
        String a8=Long.toString(a7);
        
    output1= a1+a2+a3+a4+a5+a6+a8;
     
    }
}
