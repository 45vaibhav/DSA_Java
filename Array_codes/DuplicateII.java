//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

import java.util.*;

class DuplicateII{
	public void  duplicate(int arr[],int k){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]&& Math.abs(i-j)<=k){
					System.out.println("true");
				}else{
					System.out.println("false");
				}
			}
		}
		
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements :");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the k :");
		int k=sc.nextInt();
		DuplicateII d=new DuplicateII();
			d.duplicate(arr,k);
	}
}