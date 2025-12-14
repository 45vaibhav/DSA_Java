// i want the the factorial containes how many zeros 

import java.util.*;
class TrailingZero{
	public void trailing(int n){
		int count =0;
		while(n>0){
		n=n/5;
		count=count+n;
		}
	System.out.println("the zero present is :" +count);
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		TrailingZero z=new TrailingZero();
			z.trailing(n);
	}
	
}


/*
Enter the number :
50
the zero present is :12
*/