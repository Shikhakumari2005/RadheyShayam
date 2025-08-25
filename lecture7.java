public class lecture7 {
    public static void main(String[] args) {
        
        //lecture8
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for(int j=1 ;j<=i+1;j+=1){
                 //sum +=j;
                System.out.print(j);
                if(j<i+1){
                    System.out.print("+");
                }
                sum +=j;
            }
        
            System.out.println("= " + sum);
        }
    }
}

