

public class lecture10 {
    public static void main(String arg[]){
       

        for (int i = 0; i < 5; i++) {
            for (int j = 2 * i + 1; j < 2 * 5; j += 2) {
                System.out.print(j + " ");
            }

            // Purpose: This variable is used in the second inner loop to generate another sequence of numbers starting from 1.
            int a = 1;
            for (int k = 0; k < i; k++) {
                System.out.print(a + " ");
                a += 2;
            }
            System.out.println();
        }
    }
}
