import java.util.ArrayList;
import java.util.List;

public class plusminus {
    public static void plusMinus(List<Integer> list) {
        // Write your code here
            double P=0;
            double N=0;
            double z=0;
            double cp=0;
            double cn=0;
            double c=0;
            int n=list.size();
           
            for(int i=0;i<n;i++ ){
                if(list.get(i)>0){
                     cp++;
                }
                else if(list.get(i)<0){
                     cn++;
                }
                else if(list.get(i)==0){
                     c++;
                }
            }
            P=cp/n;
            System.out.printf("%.4f\n",P);
            N=cn/n; 
            System.out.printf("%.4f\n",N);
            z=c/n; 
            System.out.printf("%.4f\n",z);
            return ;
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(-30);
        list.add(-50);
        list.add(0);
        plusMinus(list);

    }
}
