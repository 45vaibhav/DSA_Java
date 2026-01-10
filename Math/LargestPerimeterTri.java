// i want to find the largets perimeter of the triangle 

import java.util.*;

class LargestPerimeterTri{
	void perimeter(int []arr){
		Arrays.sort(arr);
		int sum=0;
	for(int i=arr.length-1;i>=2;i--){
		if(arr[i-1]+arr[i-2]>arr[i]){
			sum=arr[i]+arr[i-1]+arr[i-2];
			System.out.println("the largest perimeter of triangle is : "+sum);
				}
			}
	
		}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array :");
			int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the element of array :");
		for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		}
		LargestPerimeterTri l=new LargestPerimeterTri();
			l.perimeter(arr);

		}
	
	}

/*
enter the size of array :
3
enter the element of array :
2 1 2
the largest perimeter of triangle is : 5
*/