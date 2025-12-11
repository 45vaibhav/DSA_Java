
import java.util.*;
class Demo{
	public static void main(String args[]){
	int arr[]={1,2,2,3,4,2,4};
	int new_arr[]=new int[arr.length];
	HashMap<Integer , Integer> hm=new HashMap();
	for(int i=0;i<arr.length;i++){
		hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
		
	}
	for(int i=0;i<7;i++){
		System.out.println(hm);
		}
	
	}
	
}