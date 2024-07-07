package Assignment;

import java.util.Scanner;


class UnderAgedException extends Exception{
	@Override
	public String getMessage() {
		return "Your are UnderAged";
	}
}  
class OverAged extends Exception
{
	@Override
	public String getMessage() {
    	return "You are overAged";
	}
}
class  RtoBranch {

 Scanner scan = new Scanner(System.in);
	 int Age;
	  public void  acceptInput() {
	  System.out.println("enter the age");
	 Age = scan.nextInt(); 
	 }
	 void validData()throws Exception {
		 if(Age<18){
			 UnderAgedException UA= new UnderAgedException();
			 System.out.println( UA.getMessage()); 
			      throw UA;
		 }
		
		 else if(Age>=60){
			 OverAged OA= new OverAged();
			  System.out.println( OA.getMessage()); 
			     throw OA;
		 }
		 else {
			   System.out.println("valid Age !! Proceed further to complete Application process");
		 }
	 }
	 }

	 class Rto{
		 public void init()	 {
		  RtoBranch r= new RtoBranch();
		 try{
			 r.acceptInput();
		     r.validData();	 
		 }
		 catch(Exception e){	 
			 try {
				 r.acceptInput();
				 r.validData(); 
			 }
			 catch (Exception f){
				try{
					 r.acceptInput();
					  r.validData();
				}
				catch (Exception g){
				 System.out.println(" YOU ARE NOT !! ELIGIBLE... To Apply");
				}
			 }
		 }
    }
}
		 
	 
public class Govt {
public static void main(String[] args) {
		 Rto rto=	new Rto();
	     rto.init();	
	     }
}
