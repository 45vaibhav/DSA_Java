//Return the maximum sum of the happiness values of the selected children you can achieve by selecting k children.

import java.util.*;

class MaxHappiness{
	public void happiness(int arr[],int k){
		int sum=0;
		int left=0;
		int right=arr.length-1;
		
		Arrays.sort(arr);
		while(left<right){
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		for(int i=0;i<k;i++){
			sum=sum+arr[i];
			for(int j=i+1;j<k;j++){
				arr[j]=arr[j]-1;
			}
		}
		if(arr[arr.length-1]<0){
			sum=sum+1;
		}
		System.out.println("the maximum sum of happiness is : "+sum);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array element :");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter k : ");
			int k=sc.nextInt();
		MaxHappiness m=new MaxHappiness();
			m.happiness(arr,k);
	}
}

/*
Enter the array size :
4
Enter the array element :
2 3 4 5
Enter k :
1
the maximum sum of happiness is : 5
*/