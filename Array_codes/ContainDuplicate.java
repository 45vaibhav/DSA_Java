// if any value comes again in array then show this value 

import java.util.*;

class ContainsDuplicate{
	public void duplicate(int arr[]){
			Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]==arr[i+1]){
				System.out.println("the duplicate number is :"+arr[i]);
			}
		}
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size :");
			int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("eneter the array element :");

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		ContainsDuplicate d=new ContainsDuplicate();
				d.duplicate(arr);
		
	}
}

/*
enter the array size :
5
eneter the array element :
3 4 1 3 8
the duplicate number is :3

*/