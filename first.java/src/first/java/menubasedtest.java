package first.java;

import java.util.Scanner;

public class menubasedtest {  
	
	public static void main(String[] args) {
		System.out.println("hi from main");
		System.out.println("1 for prime");
		System.out.println("2 for fact");
		System.out.println("3 for exit");
		int x;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		if(x==1) {
		PrimeExample primeExample=new PrimeExample();
		primeExample.testPrime();}
				
				
	}
}
class PrimeExample{    
	 public void testPrime(){    
	  int i,m=0,flag=0;      
	  int n=3;//it is the number to be checked    
	  m=n/2;      
	  if(n==0||n==1){  
	   System.out.println(n+" is not prime number");      
	  }else{  
	   for(i=2;i<=m;i++){      
	    if(n%i==0){      
	     System.out.println(n+" is not prime number");      
	     flag=1;      
	     break;      
	    }      
	   }      
	   if(flag==0)  { System.out.println(n+" is prime number"); }  
	  }//end of else  
	}    
	}   
class FactorialExample{  
	 public void testfactorial(){  
	  int i,fact=1;  
	  int number=5;//It is the number to calculate factorial    
	  for(i=1;i<=number;i++){    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+number+" is: "+fact);    
	 }  
	}  