public class findelmatk {
    public static boolean ElmAtK(int[] arr ,int k){


         //BRUTE FORECE;
//         for (int i = 1; i < arr.length; i++) {
//             for (int j = i+1;j<=arr.length-1 && j<=k+i; j++) {
//                 if(arr[i]==arr[j]){
//                     System.out.println("Yes , we found a valid pair");
//                     return true;
// //why we dont use this because in j  we already we find the conditon   
//                     // if(j-i<=k){           
//                     //     return true;
//                     // }
//                 }
//             }
            
//         }
//         return false;



//USING HASHMAP 
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,3,4,3,5};
        System.out.println(ElmAtK(arr, 3));

    }
}
