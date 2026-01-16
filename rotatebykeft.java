public class rotatebykeft{
    public static int[] rotatebyk(int[] arr, int d){
        int n=arr.length;
        int temp[]=new int[n];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<d;i++){
            arr[i-(n-d)]=temp[i];
        }
        return arr;
    }
    public static void  main(String[] args){
        int[] arr={1,3,2,4,5,6,7,8,9};
        int[] res=rotatebyk(arr, 3);
        for(int elm :res){
            System.out.println(elm);

        }
    }
}