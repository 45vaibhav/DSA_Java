import java.util.*;
class MajorityEle{
	public int majority(int nums[]){
        int n=nums.length;
        int max=nums[0];
        int count=0;
        int min=nums[0];
        for(int i=1;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }
        int size=max-min+1;
            int arr[]=new int[size];
            for(int x : nums){
                arr[x-min]++;
            }
            for(int i=0;i<size;i++){
                if(arr[i]>n/2){
                    
                System.out.println(i+min);
                }
                
            }
       return -1;
    
}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++){
		nums[i]=sc.nextInt();
		}

		MajorityEle m=new MajorityEle();
			m.majority(nums);
	}	

}