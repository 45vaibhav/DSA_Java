
//Return the minimum number of boxes you need to select to redistribute these n packs of apples into boxes.

import java.util.*;
class DistApple{
	public void dist(int apple[],int capacity[]){
		int appleSum=0;
		int capacitySum=0;
		int count=0;
	   for(int i=0;i<apple.length;i++){
		appleSum+=apple[i];
		}
		Arrays.sort(capacity);
		for(int i=capacity.length-1;i>=0;i--){
			capacitySum+=capacity[i];
			count++;
			if(capacitySum>=appleSum){
				System.out.println("the minimum boxes that apple can fix is : "+count);
				break;
			}
		}
	System.out.println("the minimum boxes that apple can fix is  rrr: "+count);
		
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of apple array :");
		int n=sc.nextInt();
		int apple[]=new int[n];
		System.out.println("Enter the apple array element :");
		for(int i=0;i<n;i++){
		apple[i]=sc.nextInt();
		}

		System.out.println("Enter the size of capacity array :");
		int m=sc.nextInt();
		int capacity[]=new int[m];
		System.out.println("Enter the capacity array element :");
		for(int i=0;i<m;i++){
		capacity[i]=sc.nextInt();
		}

		DistApple d=new DistApple();
			d.dist(apple,capacity);
	}
}


/*
Enter the size of apple array :
3
Enter the apple array element :
1
3
2
Enter the size of capacity array :
5
Enter the capacity array element :
4
3
1
5
2
the minimum boxes that apple can fix is : 2
*/