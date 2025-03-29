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

//Problem 2
//Calculate Array Average
class AverageOfArray {
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        // Calculate average by dividing sum by number of elements
        return (double) sum / arr.length;
        // Return the average
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};
        // Call the method and print the result
        System.out.println("Average is: " + findAverage(arr));
    }
}

//Problem 3
class PrimeChecker {
    // Method to check if a number is prime or composite
    public static String checkPrime(int n) {
        // Check divisors from 2 up to square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // If divisible by any number, it's composite
            if (n % i == 0) {
                return "Composite";
            }
        }
        // If else, it's prime
        return "Prime";
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("7 is " + checkPrime(7));
        System.out.println("10 is " + checkPrime(10));
    }
}

//Problem 4
class Factorial {
    // Recursive factorial calculation
    public static int factorial(int n) {
        // Base cases: 0! and 1! both equal 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        // Calculate and print factorial
        System.out.println(factorial(n));
    }
}

//Problem 5
class Fibonacci {
    // Recursive Fibonacci number calculation
    public static int fibonacci(int n) {
        // fib(0)=0, fib(1)=1
        if (n == 0) return 0;
        if (n == 1) return 1;
        // fib(n) = fib(n-1) + fib(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(17));
    }
}

// Problem 6
class Power {
    // Recursive power calculation (a^n)
    public static int power(int a, int n) {
        // Base case: any number to power 0 is 1
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        // Calculate 2^10 (should be 1024)
        System.out.println(power(2, 10));
    }
}

// Problem 7
class ReverseArray {
    // Recursive array reversal
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) return;

        // Swap elements at start and end positions
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2};
        // Call reverse
        reverseArray(arr, 0, arr.length - 1);

        // Print reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

// Problem 8
class DigitChecker {
    // Wrapper method to check if string contains only digits
    public static String isAllDigits(String s) {
        if (s.isEmpty()) return "Yes";
        // Call helper method starting at index 0
        return checkDigits(s, 0) ? "Yes" : "No";
    }

    // Helper recursive method
    private static boolean checkDigits(String s, int index) {
        if (index == s.length()) return true;
        // If current character isn't digit, return false
        if (!Character.isDigit(s.charAt(index))) return false;
        return checkDigits(s, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(isAllDigits("123456")); // "Yes"
        System.out.println(isAllDigits("123a12")); // "No"
    }
}

// Problem 9
class BinomialCoefficient {
    // Recursive calculation of binomial coefficient (n choose k)
    public static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n) return 1;
        // Recursive case: Pascal's triangle rule
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
    }

    public static void main(String[] args) {
        System.out.println(binomialCoeff(2, 1)); // 2
        System.out.println(binomialCoeff(7, 3)); // 35
    }
}