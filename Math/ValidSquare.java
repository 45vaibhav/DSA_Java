//A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

import java.util.*;

class ValidSquare{
	public void square(int num){
		int half=(num/3)+1;
		for(int i=0;i<half;i++){
			if(i*i==num){
			System.out.println("it is valid perfect square :");
			}
		}
	
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int num=sc.nextInt();

		ValidSquare v=new ValidSquare();
			v.square(num);
	}
}

/*
enter number :
16
it is valid perfect square :
*/