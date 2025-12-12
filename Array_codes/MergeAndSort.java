import java.util.*;
class MergeAndSort{
	public void merge(int arr[],int arr1[],int m, int n){
		for(int i=0;i<n;i++){
			arr[m]=arr1[i];
			m++;
			}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m :");
		int m=sc.nextInt();
		System.out.println("Enter n :");
		int n=sc.nextInt();
		int arr[]=new int[m+n];
		int arr1[]=new int[n];
		System.out.println("Enter the first array element :");
		for(int i=0;i<m;i++){
		arr[i]=sc.nextInt();
		}
		System.out.println("Enter the second array element :");
		for(int i=0;i<n;i++){
		arr1[i]=sc.nextInt();
		}

		MergeAndSort s=new MergeAndSort();
		s.merge(arr,arr1,m,n);
	}

}


/*
Enter m :
4
Enter n :
3
Enter the first array element :
6
3
7
9
Enter the second array element :
4
90
2
[2, 3, 4, 6, 7, 9, 90]
*/