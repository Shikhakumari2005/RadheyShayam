public class primenumb {
    public static void main(String[] args) {
        int n=20;
        int count=0;
        for(int i=1;i<n ;i++){
            boolean isPrime = true;
            for(int  j=2 ;j<i ;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
            count++;
            System.out.println(i + " is a prime number");
            }
        }

        System.out.println("Total prime numbers between 1 and " + n + ": " + count);
    }

}

