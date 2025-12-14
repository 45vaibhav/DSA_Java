//integer reverse

import java.util.*;
class ReverseInt{
	public void reverseint(int x){
		int rem=0;
		int temp=0;
		if(x==0){
		  System.out.println(x);
		}
		while(x!=0){
		   rem=x%10;
		   temp=temp*10+rem;
		   x=x/10;
		}
		   int var=temp;
		if(var>0){
		   System.out.println(var);
		}else{
		   System.out.println(var);
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int x=sc.nextInt();
		ReverseInt r=new ReverseInt();
		   r.reverseint(x);
	}
}


/*
Enter number
432
234
*/