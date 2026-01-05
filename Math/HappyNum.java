// check number is happy or not check

import java.util.*;

class HappyNum{
	public void happy(int n){
		int num=n;
		if(n==1){
		System.out.println("Happy number :"+num);
		}
		if(n<=0){
		System.out.println("is not Happy number :"+num);
		}
		int rem=0;
		int temp=0;
		int total=0;
		while(n!=1 && n!=4){
		total=0;
		
		while(n>0){
		rem=n%10;
		temp=rem*rem;
		total=total+temp;
		n=n/10;
		   }	
		n=total;
		}
		if(n==1){
		System.out.println("Happy number :"+num);
		}else{
		System.out.println("is not Happy number :"+num);
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		HappyNum h=new HappyNum();
			h.happy(n);
	}
}

/*
Enter number :
32
Happy number :32
*/