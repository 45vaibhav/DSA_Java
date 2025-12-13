// print the palindrome of number

import java.util.*;

class Palindrome{
	public void palindrome(int n){
		int temp=n;
		int reverse=0;
		while(n>0){
		int rem = n%10;
		reverse=reverse*10+rem;
		n=n/10;
		}
		if(reverse==temp){
		System.out.println(temp+ " : is valid palindrome");
		}else{
		System.out.println(temp+ " : is not valid palindrome");
		}
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Palindrome p=new Palindrome();
			p.palindrome(n);
	}
	
}