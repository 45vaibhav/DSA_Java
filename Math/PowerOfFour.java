//Given an integer n, return true if it is a power of four. Otherwise, return false.

//An integer n is a power of four, if there exists an integer x such that n == 4x.

import java.util.*;

class PowerOfFour{
	void power(int n){
		int power=1;
		if(n<=0){
		System.out.println("not power of four ");
		}

	while(power<n){
	   power=power*4;
	}
	if(power==n){
	System.out.println("it is power of four");
		}else{
	System.out.println("not power of four ");
	}
	}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		PowerOfFour p=new PowerOfFour();
			p.power(n);
	}
}

/*
enter the number :
64
it is power of four
*/

