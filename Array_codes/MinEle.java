// i want to find the minimum element from array 

import java.util.*;

class MinEle{
	public void min(int arr[]){
		int less=arr[0];
		for(int i=1;i<arr.length;i++){
			if(less>arr[i]){
				less=arr[i];
			}
		}
	System.out.println("the minimum element is :" +less);
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size :");
			int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array element :");

		for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		}
		MinEle m=new MinEle();
			m.min(arr);
	}

}

/*
enter the array size :
5
enter the array element :
4 2 9 1 8
the minimum element is :1
*/