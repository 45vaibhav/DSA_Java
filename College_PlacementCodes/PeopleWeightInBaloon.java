import java.util.*;

public class PeopleWeightInBaloon {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of peoples : ");
        int n=sc.nextInt();
        System.out.println("Enter the avg weight of baloon : ");
        int weight =sc.nextInt();

        int sum=0;

        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>weight){
                System.out.println("the maximum people can fix : "+i);
                break;
            }
        }
    }
}


/*
Enter the number of peoples : 
5
Enter the avg weight of baloon : 
200
40 55 70 45 65 
the maximum people can fix : 3 


Enter the number of peoples : 
7
Enter the avg weight of baloon : 
200
23 56 43 12 78 45 15 
the maximum people can fix : 6
*/
