import java.util.*;
public class LongestSubArray {
    public static void main(String args[]){
        int arr[]={2 , 3 , 4 , 6 , 1 , 5};
        ArrayList<Integer>ls=new ArrayList<>();
        int k=15;
        Arrays.sort(arr);
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
            int remain=totalSum-k;
        for(int j=0;j<arr.length;j++){
            for(int m=j;m<arr.length;m++){
            totalSum=totalSum-arr[m];
                ls.add(arr[m]);
            if(totalSum==remain){
                System.out.println(ls);
            }
        }
        }
    }
}

//[1, 2, 3, 4, 5]
