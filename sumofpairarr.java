public class sumofpairarr {
    public static void main(String arg[]){
        int arr[]={1,2,3,4,5};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                sum +=arr[i] + arr[j];
                System.out.println(arr[i] + "+" + arr[j]);
                System.out.println(sum);
            }  
        }
        System.out.println(sum);     
    }
}
