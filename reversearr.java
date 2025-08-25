import java.util.Arrays;
public class reversearr {
       // static void reversearray(int arr[]) {

        //naive approach

               // function to reverse an array      
        //     int n = arr.length;
        //     int[] temp=new int[n];            //store elmt in temp arr
        //     for(int i=0 ;i<n ;i++){
        //        temp[i]=arr[n-i-1];               //Copy elements from original array to temp in reverse order
        //     }
        //     for(int i=0 ;i<n ;i++){              // Copy elements back to original array
        //         arr[i]=temp[i];
        //     }
        // // }
        // public static void main(String arg[]){
        //   int arr[]={4,7,9,1,5,8};
        //   reversearray(arr);
        //   for(int i=0 ;i<arr.length ;i++){
        //     System.out.print(arr[i]+ " ");

        //   }


        //two pointer apporch
    static void rearray(int arr[]){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(arr[left]<arr[right]){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        
        }

        public static void main(String arg[]){
            int arr[]={2,7,3,9,5};
            //call function 
            rearray(arr);
            for(int i=0 ;i<arr.length ;i++){
                System.out.print(arr[i]+ " ");
    

                
            
            }
         }
}
