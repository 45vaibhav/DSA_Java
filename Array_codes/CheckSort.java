import java.util.*;
class CheckSort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array");
		int n=sc.nextInt();
		int count=0;
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
		boolean sort=true;
		for(int i=0;i<n-1;i++){
			if(arr[i]>arr[i+1]){
				sort=false;
				break;
				}
			}
		if(sort){
			System.out.println("sorted array");
		}
		else{
			System.out.println(" not sorted array");
			}
		
		}
	
	}

/*Enter the size array
4
Enter the array elements:
11
22
33
44
sorted array
*/