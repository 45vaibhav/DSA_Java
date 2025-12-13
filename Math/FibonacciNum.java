// i want additoin of fibonacci number 

import java.util.*;
class FibonacciNum{
	public void fibonacci(int n){
		if(n<2){
		System.out.println(n);
		}
		int startNum=0;
		int endNum=startNum+1;
		int sum=0;
		for(int i=2;i<=n;i++){
		sum=startNum+endNum;
		startNum=endNum;
		endNum=sum;
		}
	System.out.println(endNum);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
	FibonacciNum f=new FibonacciNum();
		f.fibonacci(n);
	}
}