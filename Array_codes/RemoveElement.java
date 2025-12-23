//Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.

import java.util.*;

class RemoveElement{
		public void remove(int arr[],int val){
			int count=0;
			for(int i=0;i<arr.length;i++){
				if(arr[i]!=val){
					arr[count]=arr[i];
					count++;
			}

		
		}
		System.out.println("Array after remove element : ");
		for(int i=0;i<count;i++){
		System.out.println(arr[i]);
	   }
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array element : ");
		for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value to remove : ");
		int val=sc.nextInt();
		RemoveElement r=new RemoveElement();
			r.remove(arr,val);
	}
}

/*
Enter the size of array :
5
enter array element :
1
3
0
5
3
Enter the value to remove :
3
Array after remove element :
1
0
5
*/