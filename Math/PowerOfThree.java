//Given an integer n, return true if it is a power of three. Otherwise, return false.

//An integer n is a power of three, if there exists an integer x such that n == 3x.

import java.util.*;

class PowerOfThree{
	void power(int n){
		int power=1;
		if(n<=0){
		System.out.println("not power of three ");
		}

	while(power<n){
	   power=power*3;
	}
	if(power==n){
	System.out.println("it is power of three");
		}else{
	System.out.println("not power of three ");
	}
	}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		PowerOfThree p=new PowerOfThree();
			p.power(n);
	}
}

/*
enter the number :
27
it is power of three
*/