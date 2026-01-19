public class moneyspent{

    /*
     * Complete the getMoneySpent function below.
     */
    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {        
         for(int i=0;i<keyboards.length;i++){
            int sum=0;
            for(int j=0; j<drives.length;j++){
                sum=keyboards[i]+drives[j];
                if(keyboards[i]+drives[j]<b &&keyboards[i]+drives[j]>sum)
            }
         }


    }
    public static void main(String[] args) {
        int[] keyboards={12,3,5};
        int[] drives={20,10,30};
        getMoneySpent(keyboards, drives, 30);
    }
 
}
