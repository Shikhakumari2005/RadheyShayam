public class lecture9 {
    public static void main(String arg[]){
       //inverted tri
        // for(int i=0; i<5 ;i++){
        //     for (int j = 1; j < 5-i; j++) {
        //         System.out.print("*");





        //tri
        // for(int i=0; i<5 ;i++){
        //     for (int j = 1; j < i; j++) {
        //         System.out.print("*");
                
        //     }





        //inverted holly tri

        //for(int i=7; i>=1 ;i--){
            // for (int j = 1; j <= i; j++) {
            //     if (i == 7 || j == 1 || j == i) {
            //         System.out.print("* ");
            //     } else {
            //         System.out.print("  "); // Print space for hollow part
            //     }
               
            // }






            //pyramid
        for(int i=0; i<5 ;i++){
            for(int j=4-i; j>=0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                 }

            System.out.println(" ");
            for(int j=2*i;j<=i;j++)
            {
                System.out.print("*");
             }

        }
    }   
}
