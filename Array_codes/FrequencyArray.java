import java.util.*;
class FrequencyArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int max=0;
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("max element is:"+max);
		int arr1[]=new int[max+1];
		for(int i=0;i<arr.length;i++){
			arr1[arr[i]]++;
			}
		for(int i=1;i<arr1.length;i++){
			System.out.println(arr1[i]);
			}
		
		}
	
	}

/*Enter the size array
4
Enter the array elements:
1
2
2
3
max element is:3
1
2
1
*/