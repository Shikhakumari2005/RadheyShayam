public class triplesum {
    public static void main(String args[]){
        int arr[]={2,3,4,5,6,7};
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1 ;j<n ;j++){

                for(int k=j ;j<n ;j++){
                    int sum=(arr[i]+arr[j]+arr[k]);
                    System.out.println(arr[i] + " + " + arr[j] + " + " + arr[k] + " = " + sum);

                }
            }
        }
    }
}
