// i want the number of exact three dividor 

import java.util.*;

class ThreeDivisor{
	public void find(int n){
		int count=0;
	for(int i=1;i<=n;i++){
		if(n%i==0){
			count++;
			}
		}if(count==0){
	System.out.println("the number "+n + "has exact three divisor ");
	}else{
		System.out.println("the number "+n + " has not  exact three divisor ");
		}
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		
		ThreeDivisor d=new ThreeDivisor();
			d.find(n);
	}
}

/*
enter the number :
6
the number 6 has not  exact three divisor
*/