import java.util.*;
class Solution {
    static int maxSubArray(int[] nums) {
        int n=nums.length;
        int currsum=0;
        int maxsum=Integer.MAX_VALUE;
        for(int st=0 ;st<n; st++){

        //     for(int end=st ;end<n ;end++){
        //         for(int i=st; i<=end ;i++){
        //             System.out.print(arr[i]);
        //         }
        //         System.out.print(" ");
        //     }
        //     System.out.println("");
        // }
           currsum +=nums[st];
           maxsum=Math.max(currsum ,maxsum);
           if(currsum<0){
              return currsum ;
           }
        
        }
        return maxsum;
    }
    public static void main(String arg[]){
        int[] nums={3,-4,5,4,-1,7,-8};
        System.out.println(maxSubArray(nums));
    }
   
}




