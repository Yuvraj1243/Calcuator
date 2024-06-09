public class FindPeakValue {
    public static void main(String[] args) {
        int[] numbers = {9, 4, 7, 12, 89, 2};
        System.out.println("Array length: " + numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[0] < numbers[i]) {
                numbers[0] = numbers[i];
            }
        }

        System.out.println("Peak value of array is: " + numbers[0]);
    }
}
