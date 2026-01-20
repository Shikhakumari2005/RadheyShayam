public class countnumber{
    public static int count(int n){
        int cout=0;
        while(n!=0){
            int num=n/10;
            if(n%num==0){
                cout++;
            }
            num=n%10;
        }
        return cout;
    }
    public static void main(String[] args){
        int n=123;
        count(n);
        
    }
}