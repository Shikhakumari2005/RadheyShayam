import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class migratebird{

    public static int migratoryBirds(List<Integer> arr) {

        HashMap<Integer, Integer> mp = new HashMap<>();

    // Step 1: Count frequency
       for (int i = 0; i < arr.size(); i++) {
           mp.put(arr.get(i), mp.getOrDefault(arr.get(i), 0) + 1);
        }

        int maxFreq = 0;
        int birdId = Integer.MAX_VALUE;

    // Step 2: Find bird with max frequency
        for (int key : mp.keySet()) {
          int freq = mp.get(key);

            if (freq > maxFreq || (freq == maxFreq && key < birdId)) {
               maxFreq = freq;
               birdId = key;
            }
        }

        return birdId;
    }
    public static void main(String[] args){
        List<Integer>arr=new ArrayList<>();
        migratoryBirds(arr);

    }
 
}