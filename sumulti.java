import java.util.Scanner;

public class sumulti{
    public static void main(String arg[]){

        //creat arr from useer out put
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int idx = 0; idx < n; idx++) {
            arr[idx]=sc.nextInt();
            //System.out.println(arr[idx]);  
        }
        //sum and mutilple
        int sum=0;
        int multi=1;
        for (int i = 0; i < n; i++) {
            sum +=arr[i];
            multi *=arr[i];
        }
        System.out.print(sum + " ");
        System.out.print(multi  + " ");  
        
    }
}