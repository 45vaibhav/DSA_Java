// i want to check given array is palindrome or not 

import java.util.*;

class ArrayPalindrome{
	public void check(int arr[]){
		int count=0;
		int last=arr.length-1;
		int mid =arr.length/2;
		
		for(int i=0;i<mid;i++){
			if(arr[i]==arr[last-i]){
				count++;
			}

		}
		if(count==mid){
		System.out.println("it is palindrome array ");
	
		}else{

		System.out.println("it is not  palindrome array ");
		}

	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array :");
			int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("enter the array element :");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		ArrayPalindrome a=new ArrayPalindrome ();
				a.check(arr);
	}
}

/*
enter the size of array :
4
enter the array element :
1 2 2 1
it is palindrome array
*/