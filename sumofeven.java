public class sumofeven {
    public static void main(String[] args) {
        int arr[]={2 ,3 ,4,5,6};
        int n=arr.length;
        // int sumeven=0;
        // for(int i=0 ;i<n ;i++){
        //     if(arr[i]%2==0){
        //         sumeven +=arr[i];
        //         System.out.println(sumeven + " ");    //this will print every once
        //     }
        //     System.out.println(sumeven + " ");           //this will print twice
        // }
        // int sumodd=0;
        // for(int i=0 ;i<n ;i++){
        //     if(arr[i]%2!=0){
        //         sumodd +=arr[i];
        //     }
    //     }
    //     System.out.println(sumodd + " ");
    // }
//}

        int odd_ind_sum=0;
        int even_ind_sum=0;
        for(int i=0;i<arr.length;i++){
           if(i%2==0){
              even_ind_sum+=i;
            }else{
              odd_ind_sum+=i;
            }
        }
        System.out.println(even_ind_sum+" + "+ odd_ind_sum);
        System.out.println(even_ind_sum+ " ");
        System.out.println(odd_ind_sum + " ");
    }
}