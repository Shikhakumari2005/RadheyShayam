public class staircase {
    public static void staircase(int n) {
        // Write your code here
               for(int i=1; i<=n;i++){
                //print space
                for(int j=1;j<=n-i;j++){
                    System.out.print (" ");
                }
                //print #
                for(int j=n;j>n-i;j--){
                    System.out.print ("#");
                }
                System.out.println();
               }
        }
        public static void main(String[] args){
            int n=6;
            staircase(6);
        }
}
