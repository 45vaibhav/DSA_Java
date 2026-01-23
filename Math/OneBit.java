//Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

import java.util.*;

class OneBit{
	public void bit(int num){
		int count=0;
		String sum=Integer.toBinaryString(num);

		for(int i=0;i<sum.length();i++){
			if(sum.charAt(i)=='1'){
				count++;
			}
		}
	System.out.println("the number contain :"+count + " bit of one");
	
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			System.out.println("enter the number :");
			int num=sc.nextInt();
		OneBit o=new OneBit();
			o.bit(num);
	}
}

/*
enter the number :
11
the number contain :3 bit of one
*/