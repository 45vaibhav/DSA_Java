// i want addition of all divisior is equal to number

import java.util.*;

class PerfectNum{
	public void perfect(int n){
		int half=n/2;
		int sum=0;
		for(int i=1;i<=half;i++){
		if(n%i==0){
		sum=sum+i;
		   }
		}
	if(sum==n){
		System.out.println("the number is perfect number :" +n);
		}else{
		System.out.println("the number is not perfect number :" +n);
		}
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		PerfectNum p=new PerfectNum();
			p.perfect(n);
	}
}

/*
Enter the number :
32
the number is not perfect number :32
*/