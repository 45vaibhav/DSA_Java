import java.util.*;
class MergeSortMedian{
	public double merge(int arr[],int arr1[],int m, int n){
		for(int i=0;i<n;i++){
			arr[m]=arr1[i];
			m++;
			}
		Arrays.sort(arr);
		int mid=(m+n)/2;
		double  mean=0;
		double avg=0;
		if((mid*2)%2!=0){
			avg=arr[mid];
		}else{
			mean=arr[mid]+arr[mid-1];
			avg=mean/(2.0);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(avg);
		return avg;
		
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

		MergeSortMedian s=new MergeSortMedian();
		s.merge(arr,arr1,m,n);
	}

}