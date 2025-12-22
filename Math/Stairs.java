// i want to the climb stairs form bottom to top but i can only climb only 1 or 2 steps at one time i want way how can i climb ,

import java.util.*;

class Stairs{
	public void way(int num){
		int first=0;
		int second=1;
		int sum=0;
		for(int i=0;i<num;i++){
			sum=first+second;
			first=second;
			second=sum;
		}
		System.out.println("the ways of climbing stairs is :" + second);
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		Stairs s=new Stairs();
			s.way(num);
	}
}



/*
Enter the number :
6
the ways of climbing stairs is :13

*/