
import java.util.HashSet;

public class removedublicate {
    public static int[] removedub(int[] arr){
        //Hashset
        HashSet<Integer>newar=new HashSet<>();
        
        // add elements to set
        for(int elm:arr){
            newar.add(elm);
        }
        System.out.println(newar);


        // convert set back to array
        int[] result = new int[newar.size()];
        int i = 0;
        for (int x : newar) {
            result[i++] = x;
        }
        return result;




//if we just retrun void or int
        // // print result
        // for (int x : result) {
        //     System.out.print(x + " ");
        // }
        // return x;
    }
    public static void main(String[] args){
        int arr[]={2,3,4,5,6,7,8,9};
        int[] ans = removedub(arr);

        // for (int x : ans) {
        //     System.out.print(x + " ");
        // }
    }
}
