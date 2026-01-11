
import java.util.HashMap;

public class countpair1 {
    public static int countP(int[] arr, int k){
        //Bruteforece Approach
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1 ;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }

                // if(arr[i]-arr[j]==k){
                //     count++;
                // }
            } 
        }
        return count;




    //Optimize Approach
        // HashMap<Integer,Integer> mp=new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        //     int complementry=k-arr[i];
        //     if(mp.containsKey(complementry)){
        //         count++;
        //     }
        //     mp.put(arr[i],1);
            
        // }
        // return  count;
    }
    public static void main(String[] args){
        int[] arr={2,1,2,3,6,3,2};
        int res=countP(arr, 4);
        System.out.print(res);
    }
}
