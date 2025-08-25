public class countevenodd {
        public static void main(String args[]){
            int arr[]={1,2,3};
            int n=arr.length;
            int countOdd=0;
            int countEven=0;
            for(int i=0; i<n; i++){
                for(int j=i+1 ;j<n;j++){
                    for(int k=j+1;j<n ;j++){
                        int sum=(arr[i]+arr[j]+arr[k]);
                        System.out.println(arr[i] + " + " + arr[j] + " + " + arr[k] + " = " + sum);
                        if(sum%2==0){
                            countEven++;
                        }
                        
                        else{
                            countOdd++;
                            
                        }
                        
                    }
                }
            }
            System.out.println("Total Even Sums: " + countEven);
            System.out.println("Total Odd Sums: " + countOdd);
            System.out.println("Total Triplets: " + (countEven + countOdd));
        }
    
    
}
