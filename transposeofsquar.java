public class transposeofsquar {
    public static void main(String[] args){
        int[][] arr={{2,3,4,23},{5,6,7,24},{11,12,13,25},{14,15,16,26}};
        for(int i=0;i<arr.length;i++){  
            for(int j=i+1; j<arr[0].length ;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
                //System.out.println(arr);
            }
        }
        print(arr);
    }
    public static void print(int[][] arr){
        for(int[] a :arr){                   //This correctly iterates over each row of the 2D array.
            //for(int elm : arr){                  You're trying to iterate over arr (which is a 2D array) instead of a (which is a 1D row).
                                              //So elm becomes a 1D array, not an integer.
                                             //Trying to print elm + " " will cause a type mismatch or print memory references like [I@1a2b3c.
                 
                 
            for(int elm : a){     
                System.out.print(elm +" ");
            }
            System.out.println("");

        }
    }
}
