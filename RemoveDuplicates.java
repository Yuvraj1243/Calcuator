// Java Program to Remove Duplicate Elements
public class RemoveDuplicates {
    public static int removeDuplicates(int array[], int size) {
        if (size == 0 || size == 1) {
            return size;
        }
        int uniqueIndex = 0;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[uniqueIndex++] = array[i];
            }
        }
        array[uniqueIndex++] = array[size - 1];
        return uniqueIndex;
    }

    public static void main(String[] args) {
        int numbers[] = { 5, 5, 10, 10, 15, 20, 20, 25, 30, 30, 35 };
        int length = numbers.length;
        int newSize = removeDuplicates(numbers, length);
        for (int i = 0; i < newSize; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
