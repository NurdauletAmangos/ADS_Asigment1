//Problem 1
// Recursive method to find the smallest number in an array
public class Main {
    public static class MinimumRecursive {
        public static int findMinimum(int[] arr, int n) {
            if (n == 1) return arr[0];
            return Math.min(arr[n - 1], findMinimum(arr, n - 1));
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 1, 32, 3, 45};
        int minimum = MinimumRecursive.findMinimum(array, array.length);
        System.out.println("Minimum element is: " + minimum);
    }
}