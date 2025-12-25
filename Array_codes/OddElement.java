// i want to find the odd  & even element of array 

import java.util.*;

class OddElement{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size :");
			int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array element :");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();

		
		}
		System.out.println("Odd elements are :");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				System.out.println(arr[i]);
			}
		}
		System.out.println("Even elements are :");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				System.out.println(arr[i]);
			}
		}
		
	}
}


/*
Enter the array size :
5
Enter the array element :
2
4
6
7
9
Odd elements are :
7
9
Even elements are :
2
4
6
*/