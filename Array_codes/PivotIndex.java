//The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's righ

import java.util.*;

class PivotIndex{
	public void pivot(int arr[]){
		for(int i=0;i<arr.length;i++){
			int leftSum=0;
			for(int j=i;j>=0;j--){
			leftSum+=arr[j];
			}
			int rightSum=0;
			for(int k=i;k<arr.length;k++){
				rightSum+=arr[k];
			}
				if(leftSum==rightSum){
				System.out.println("the index is :"+i);
			}
		}
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array element :");
			for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
		PivotIndex p=new PivotIndex();
			p.pivot(arr);
	}
}

/*
enter the size of array :
6
enter the array element :
1 7 3 6 5 6
the index is :3

*/