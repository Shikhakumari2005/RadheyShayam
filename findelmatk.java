public class findelmatk {
    public static boolean ElmAtK(int[] arr ,int k){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <=k+1; j++) {
                if(arr[i]==arr[j]){
                    if(j-i<=k){
                        return true;
                    }
                }
                else return false;
                
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,3,4,3,5};
        System.out.println(ElmAtK(arr, 3));

    }
}
