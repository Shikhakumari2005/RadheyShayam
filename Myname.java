
public class Myname{
    public static void main(String args[]){
      
      
      //lecture 32)
        for(int i=4 ; i>=0; i--){                      //this only define numbers of row 
              for(int j=i;j <=4 ; j++){                //this also only col number of col
                 System.out.print((char)(65+ j)+ " ");
              }
              System.out.println(" ");
        }
 


    //lecturre41)
    // for(int i=1 ;i<=5 ;i++){
    //     //space
    //     for(int j=0 ;j<=5-i ;j++){
    //         System.out.print(" ");
    //     }
    //     //inner loop
    //     for(int j=1 ;j<=i ;j++){
    //        // System.out.print(j + " ");
    //        System.out.print(j);
    //     }
    //     System.out.println(" ");
    // }






   // lecture42)
    // for(int i=4; i>=1 ;i--){
    //     for(int j=1 ;j<=i ;j++){
    //         System.out.print(i);
    //     }
    //     System.out.println(" ");
    // }
    







    //lecture51)
    //int n=1;
    // for(int i=0 ;i<5 ;i++){  
    //     //no of row
    //     for(int j=0 ;j<=5-i ;j++){
    //         System.out.print(" ");
    //     }
    //     //inner loop
    //     for(int j=1 ;j<=i ;j++){
    //        // System.out.print(j + " ");
    //        System.out.print(i + j -1 );
    //       // n++;
    //     }
    //     // for(int j=1 ;j>=0 ;j--){
    //     //     System.out.print(i+j+1);
    //     // }
    //     for (int j = 2 * i; j >= i + 1; j--) {
    //         System.out.print(j);
    //     }
    //     System.out.println(" ");
    // }







    //lecture52)

    
//     Scanner scanner = new Scanner(System.in);
//     int n = scanner.nextInt();
//     int x = (n / 2) + 1;

//     // First part
//     for (int i = 0; i < x; i++) {
//         for (int j = 1; j <= x- i - 1; j++) {
//             System.out.print(".");
//         }
//         for (int j = 1; j <= 2 * i + 1; j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//     }

//     // Second part
//     for (int i = 1; i <= (n - x); i++) {
//         for (int j = 1; j <= i; j++) {
//             System.out.print(".");
//         }
//         for (int j = 1; j <= n - (2 * i); j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
    }
}
       