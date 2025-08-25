public class explainoutAinloop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
           System.out.println("After adding " + arr[i] + ", sum is: " + sum);
        }

        int[] arr1 = {1, 2, 3, 4};
        int sum1 = 0;

        for (int i = 0; i < arr.length; i++) {
        sum1 += arr[i];
        }
        System.out.println("Final sum is: " + sum);

    }
}
