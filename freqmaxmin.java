// import java.util.HashMap;

// public class freqmaxmin {
//     public static int MaxMin(int[] arr){
//         HashMap<Integer ,Integer> mp=new HashMap<>();
//         for(int i=0; i<arr.length;i++){
//            if(mp.containsKey(arr[i])){
//         //mp is hsahmap not a key
//             int freq=mp.get(arr[i]);

//             mp.put(arr[i], freq+1);
//            }
//            else{
//                mp.put(arr[i] ,1);
//            }
//         }
//         int maxfreq=0;
//         int minfreq=0;
//         for(int elmt: mp.keySet()){
//             int freq=mp.get(elmt);
//             if(freq>maxfreq){
//                 maxfreq=freq;
//             }
//             else{
//             //    This does not find minimum, it just overwrites.
//             //   minfreq=freq;
//             }
//         }
//         return (maxfreq ,minfreq);
        
//     }
//     public static void main(String[] args){
//         int[] arr={1,3,2,44,3,4,3,5,3,2};
//         System.out.println(MaxMin(arr)):

//     } 
// }
import java.util.HashMap;

public class freqmaxmin {

    public static int[] MaxMin(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        // Frequency count
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        int maxfreq = Integer.MIN_VALUE;
        int minfreq = Integer.MAX_VALUE;

        // Find max & min frequency
        for (int elmt : mp.keySet()) {
            int freq = mp.get(elmt);
            maxfreq = Math.max(maxfreq, freq);
         
            minfreq = Math.min(minfreq, freq);

        }

        return new int[]{maxfreq, minfreq};
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 44, 3, 4, 3, 5, 3, 2};
        int[] result = MaxMin(arr);

        System.out.println("Max Frequency: " + result[0]);
        System.out.println("Min Frequency: " + result[1]);
    }
}
