public class NumericArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 6, 5, 10 };
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
