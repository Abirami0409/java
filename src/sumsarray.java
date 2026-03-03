public class sumsarray {
    public static void main(String[] args) {

        int[] arr = {2, 42, 6, 8};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}
