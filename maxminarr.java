public class maxminarr {

    public static int minimum(int A[], int N){
        int min=Integer.MAX_VALUE;             //intionalize  with Max_VALUE 
        for(int i=0 ; i<N ;i++){
          if(A[i]<min){      //check condition if satisfy then upadte min vlaue with new value 
            min=A[i];         //update  till conditon satisfy
          }
        }
        return min;

    }
    public static int maximum(int Arr[] ,int size){
      int maxi=Integer.MIN_VALUE;
      for(int j=0 ;j<size ; j++){
        if(Arr[j]>maxi){
          maxi=Arr[j];
        }
      }
      return maxi;
    }

    

    public static void main(String[] args){

          int A[]={3,6,1,9,3};
          int N=A.length;
          int Arr[]={22,14,8,17,35,3};
           int size=Arr.length;
          System.out.println("Minimum elmt" + minimum(A,N));
          System.out.println("Maximum elmt" + maximum(Arr,size));
    }
}
