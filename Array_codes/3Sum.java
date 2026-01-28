//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

//Notice that the solution set must not contain duplicate triplets.

import java.util.*;
class ThreeSum{
	public void triplet(int [] arr){
		List<List<Integer>> ls=new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				for(int k=j+1;k<arr.length;k++){
					if(arr[i]+arr[j]+arr[k]==0){
						ls.add(Arrays.asList(arr[i],arr[j],arr[k]));
					}
				}
			}
		}
	System.out.println("list is "+ls);
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			System.out.println("enter the size of array :");
			int n=sc.nextInt();
			int [] arr=new int[n];
			for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			}
		ThreeSum s=new ThreeSum();
		s.triplet(arr);
		
	}
}

/*
enter the size of array :
6
-1 0 1 2 -1 -4
list is [[-1, 0, 1], [-1, 2, -1], [0, 1, -1]]
*/