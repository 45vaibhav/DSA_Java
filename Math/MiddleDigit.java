// i want to find the exactly middle element of the number

import java.util.*;

class MiddleDigit{
	public void middle(int num){
		int sum=0;
		int rem=0;
		int mid=0;
		while(num>9){
			num=num/10;
			rem=num%10;
			sum=sum*10+rem;
			}
		while(sum>9){
			sum=sum/10;
			rem=sum%10;
			mid=mid*10+rem;
		  }
		System.out.println("the middle element is :"+mid);					

	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		MiddleDigit m=new MiddleDigit();
			m.middle(num);
	}

}

/*
Enter the number :
12345
the middle element is :234
*/