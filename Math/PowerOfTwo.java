// i want the number is power of two or not 

import java.util.*;
class PowerOfTwo{
	public void power(int n){
		
		if(n<=0){
		System.out.println("the number :"+n+" : is not power of 2");
		}else if((n & (n - 1)) == 0){
		System.out.println("the number :"+n+":is power of 2");
		}else{
		System.out.println("the number :"+n+" : is not power of 2");
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		PowerOfTwo p=new PowerOfTwo();
			p.power(n);
	}
}


/*
Enter the number :
32
the number :32:is power of 2
*/